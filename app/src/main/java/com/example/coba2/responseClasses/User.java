package com.example.coba2.responseClasses;

import com.google.gson.annotations.SerializedName;

public class User{

	@SerializedName("id")
	private int id;


	public void setId(int id){
		this.id = id;
	}

}