package com.monica.cms.mvc;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.monica.cms.domain.Article;
import com.monica.cms.service.ArticleService;
import com.monica.mvc.BaseController;
import com.monica.sso.bo.User;
import com.monica.sso.manager.SessionManager;

@Controller
@RequestMapping(value="/articles")
public class ArticleController extends BaseController<Article>{

	@Autowired
	private ArticleService articleService;
	
	@Resource
	private SessionManager sessionManager;
	
	@Override
	protected Class<Article> getClassType() {
		return Article.class;
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public String get(@PathVariable int id, Model model,HttpSession session){
		User user = sessionManager.getVisitingUser(session);
		Article article = articleService.readArticle(user,id);
		model.addAttribute("article",article);
		return "article/detail";
	}

}
