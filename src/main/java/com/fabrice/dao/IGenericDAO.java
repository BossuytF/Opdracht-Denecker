package com.fabrice.dao;

import java.util.List;

public interface IGenericDAO <E, K> {
	
	public void add(E entity) ;
    public void saveOrUpdate(E entity) ;
    public void update(E entity) ;
    public void remove(K key);
    public E find(K key);
    public List<E> getAll() ;
}
