package com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Admin {
	
	@Id
	private int aid;
	private String aname;
	
	public Admin() {
		super();
	}
	public Admin(int aid, String aname) {
		super();
		this.aid = aid;
		this.aname = aname;
	}
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	@Override
	public String toString() {
		return "Admin [aid=" + aid + ", aname=" + aname + "]";
	}
	
	
	
	

}
