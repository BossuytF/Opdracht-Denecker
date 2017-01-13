package com.fabrice.dao;


import java.io.Serializable;
import java.util.List;

import javax.persistence.criteria.CommonAbstractCriteria;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.print.attribute.standard.RequestingUserName;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.BaselineSessionEventsListenerBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public abstract class GenericDaoImpl <E, K extends Serializable> implements IGenericDAO<E, K>{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	protected Class<? extends E> daoType;
	

	public GenericDaoImpl() {
		Type t = getClass().getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType) t;
        daoType = (Class) pt.getActualTypeArguments()[0];
    }
	
	protected Session currentSession() {
	    return sessionFactory.getCurrentSession();
	}

	public void add(E entity) {
		currentSession().save(entity);	
	}

	public void saveOrUpdate(E entity) {
		currentSession().saveOrUpdate(entity);
	}

	public void update(E entity) {
		currentSession().saveOrUpdate(entity);	
	}

	public void remove(K key) {
		currentSession().delete(key);	
	}

	public E find(K key) {
		return (E) currentSession().get(daoType, key);
	}

	public List<E> getAll() {
		CriteriaBuilder builder = currentSession().getCriteriaBuilder();
		CriteriaQuery<E> criteria = (CriteriaQuery<E>) builder.createQuery(daoType);
		criteria.from(daoType);
		List<E> list = currentSession().createQuery(criteria).getResultList();
		return list;
		
	}
}
