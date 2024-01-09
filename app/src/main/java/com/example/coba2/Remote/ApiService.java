package com.example.coba2.Remote;


import com.example.coba2.responseClasses.ResponseClass;
import com.example.coba2.responseClasses.ResponseRegisterClass;
import com.example.coba2.responseClasses.ResponseToko;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface ApiService {
    @POST("/addUser")
    Call<ResponseClass> addUser(@Body ResponseRegisterClass responseRegisterClass);

    @POST("/login")
    Call<ResponseClass> getUser(@Body ResponseRegisterClass responseRegisterClass);

    @PUT("/regist")
    Call<ResponseClass> registToko(@Body ResponseToko responseToko);
}
