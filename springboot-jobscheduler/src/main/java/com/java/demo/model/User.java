package com.java.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	@Id
	@GeneratedValue
	private long id;
	private String name;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public User(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}



	public void setId(int id) {
		this.id = id;
	}
	public long getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}



	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
	
	
}
