package com.example.coba2.responseClasses;

import com.google.gson.annotations.SerializedName;

public class ResponseClass {

	@SerializedName("id")
	private Integer id;

	@SerializedName("password")
	private String password;

	@SerializedName("username")
	private String etUsername;

	@SerializedName("role")
	private String role;

	public ResponseClass(Integer id, String password, String etUsername, String role) {
		this.id = id;
		this.password = password;
		this.etUsername = etUsername;
		this.role = role;
	}

	public Integer getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}

	public String getEtUsername() {
		return etUsername;
	}

	public String getRole() {
		return role;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setEtUsername(String etUsername) {
		this.etUsername = etUsername;
	}

	public void setRole(String role) {
		this.role = role;
	}
}