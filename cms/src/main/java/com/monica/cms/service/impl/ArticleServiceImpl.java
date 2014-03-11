package com.monica.cms.service.impl;

import com.monica.cms.domain.Article;
import com.monica.cms.manager.ArticleManager;
import com.monica.cms.service.ArticleService;
import com.monica.sso.bo.User;

public class ArticleServiceImpl implements ArticleService{

	private ArticleManager articleManager;
	
	public void addNew(Article article) {
		
	}

	public Article readArticle(User user, int id) {
		Article article = articleManager.get(id);
		if(article!=null){
			
		}
		return null;
	}

}
