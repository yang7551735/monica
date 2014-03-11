package com.monica.dao;

import java.util.List;

import com.monica.dao.bo.PagedList;
import com.monica.dao.bo.SearchFilter;

public interface BaseDao {
	
	<T> PagedList<T> paged(Class<T> clazz,SearchFilter searchFilter);
	
	<T> List<T> list(Class<T> clazz,SearchFilter searchFilter);
	
	<T> T get(Class<T> t,int id);
	
	<T> void addNew(Class<T> clazz,T t);
	
	<T> void update(Class<T> clazz,T t);
	
	<T> void delete(Class<T> clazz,T t);

	<T> List<T> listAll(Class<T> clazz);
}
