package com.example.coba2.responseClasses;

import com.google.gson.annotations.SerializedName;

public class ResponseToko{

	@SerializedName("namaToko")
	private String namaToko;

	@SerializedName("user")
	private User user;

	@SerializedName("alamat")
	private String alamat;

	public void setNamaToko(String namaToko){
		this.namaToko = namaToko;
	}

	public String getNamaToko(){
		return namaToko;
	}

	public void setUser(User user){
		this.user = user;
	}

	public User getUser(){
		return user;
	}

	public void setAlamat(String alamat){
		this.alamat = alamat;
	}

	public String getAlamat(){
		return alamat;
	}

	public ResponseToko(String namaToko, User user, String alamat) {
		this.namaToko = namaToko;
		this.user = user;
		this.alamat = alamat;
	}
}