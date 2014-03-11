package com.monica.dao.bo;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class BaseEntity {
	
    @Id  
    @GeneratedValue(strategy=GenerationType.AUTO)  
	private int id;
    
    private long createdTime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(long createdTime) {
		this.createdTime = createdTime;
	}
	
}
