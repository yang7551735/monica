package com.monica.mvc;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.monica.dao.bo.SearchFilter;
import com.monica.manager.BaseManager;

public abstract class BaseController<T> {

	private static final int DEFAULT_PAGESIZE = 20;

	private Class<T> clazz;
	
	private BaseManager<T> baseManager;
	
	@RequestMapping(value="/")
	public String list(Model model){
		model.addAttribute(getLowerCaseName()+"s", baseManager.listAll());
		return getLowerCaseName()+"/list";
	}
	
	@RequestMapping(value="/page/{pageNo}")
	public String page(@PathVariable int pageNo,Model model){
		SearchFilter sf = SearchFilter.getPagedFilter(pageNo,getPageSize());
		model.addAttribute(getLowerCaseName()+"s", baseManager.paged(sf));
		return getLowerCaseName()+"/page";
	}
		
	protected abstract Class<T> getClassType();

	private String getLowerCaseName(){
		return clazz.getSimpleName().toLowerCase();
	}
	
	protected int getPageSize(){
		return DEFAULT_PAGESIZE;
	}
}
