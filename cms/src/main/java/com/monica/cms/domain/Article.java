package com.monica.cms.domain;

import javax.validation.constraints.Size;

public class Article {
	
	private int id;
	
	@Size(min=3,max=70,message="文章标题需要限制在3-70个字符之间")
	private String title;
	
	private String content;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	
}
