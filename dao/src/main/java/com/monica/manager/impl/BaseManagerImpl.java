package com.monica.manager.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.monica.dao.BaseDao;
import com.monica.dao.bo.PagedList;
import com.monica.dao.bo.SearchFilter;
import com.monica.manager.BaseManager;

public abstract class BaseManagerImpl<T> implements BaseManager<T> {

	@Autowired
	private BaseDao baseDao;
	
	public abstract Class<T> getClassType();
	
	public PagedList<T> paged(SearchFilter searchFilter) {
		return baseDao.paged(getClassType() ,searchFilter);
	}

	public List<T> list(SearchFilter searchFilter) {
		return baseDao.list(getClassType(),searchFilter);
	}
	
	public List<T> listAll(){
		return baseDao.listAll(getClassType());
	}

	public T get(int id) {
		return baseDao.get(getClassType(),id);
	}

	public void addNew(T t) {
		baseDao.addNew(getClassType(),t);
	}

	public void update(T t) {
		baseDao.update(getClassType(),t);
	}

	public void delete(T t) {
		baseDao.delete(getClassType(),t);
	}

}
