package com.example.coba2.responseClasses;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class ResponseRegisterClass implements Serializable {

	@SerializedName("password")
	private String password;

	@SerializedName("username")
	private String username;

	public ResponseRegisterClass(String username, String password) {
		this.username = username;
		this.password = password;
	}


	public void setPassword(String password){
		this.password = password;
	}

	public String getPassword(){
		return password;
	}

	public void setUsername(String username){
		this.username = username;
	}

	public String getUsername(){
		return username;
	}

	@Override
 	public String toString(){
		return 
			"ResponseRegisterClass{" + 
			"password = '" + password + '\'' + 
			",username = '" + username + '\'' + 
			"}";
		}
}