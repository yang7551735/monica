package com.monica.cms.service;

import com.monica.cms.domain.Article;
import com.monica.sso.bo.User;

public interface ArticleService {

	void addNew(Article article);

	Article readArticle(User user, int id);

}
