package com.monica.manager;

import java.util.List;

import com.monica.dao.bo.PagedList;
import com.monica.dao.bo.SearchFilter;

public interface BaseManager<T> {

	PagedList<T> paged(SearchFilter searchFilter);
	
	List<T> list(SearchFilter searchFilter);
	
	List<T> listAll();
	
	T get(int id);
	
	void addNew(T t);
	
	void update(T t);
	
	void delete(T t);
	
}
