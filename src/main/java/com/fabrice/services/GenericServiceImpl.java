package com.fabrice.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.fabrice.dao.IGenericDAO;

@Service
public abstract class GenericServiceImpl<E, K> implements IGenericService<E, K> {
 
	@Autowired
    private IGenericDAO<E, K> genericDao;
 
    public GenericServiceImpl(IGenericDAO<E,K> genericDao) {
        this.genericDao=genericDao;
    }
 
    public GenericServiceImpl() {
    }
    
    
    @Transactional(propagation = Propagation.REQUIRED)
    public void saveOrUpdate(E entity) {
        genericDao.saveOrUpdate(entity);
    }
 

    @Transactional(propagation = Propagation.REQUIRED)
    public List<E> getAll() {
        return genericDao.getAll();
    }
 

    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public E get(K id) {
    	System.out.println(id);
    	System.out.println(genericDao);
        return genericDao.find(id);
    }
 

    @Transactional(propagation = Propagation.REQUIRED)
    public void add(E entity) {
        genericDao.add(entity);
    }
 

    @Transactional(propagation = Propagation.REQUIRED)
    public void update(E entity) {
        genericDao.update(entity);
    }
 

    @Transactional(propagation = Propagation.REQUIRED)
    public void remove(K key) {
        genericDao.remove(key);
    }

 
    
}
