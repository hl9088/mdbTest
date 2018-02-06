package com.demo.ssm.pojo;

import java.io.Serializable;

public class TestBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	// id
	private String id;
	// name
	private String name;
	// password
	private String password;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
