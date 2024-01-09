package com.example.coba2;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.coba2.Remote.ApiService;
import com.example.coba2.Remote.Network;
import com.example.coba2.responseClasses.ResponseClass;
import com.example.coba2.responseClasses.ResponseToko;
import com.example.coba2.responseClasses.User;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RegistToko extends AppCompatActivity {
    EditText etNamaToko, etAlamatToko;
    Button btnRegisterToko;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regist_toko);
        initializeListeners();
        onClickListeners();

    }

    private void onClickListeners() {
        btnRegisterToko.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer id_user = getIntent().getIntExtra("idUser", 0);
                User user = new User();
                user.setId(id_user);
                if (validateUserName() && validatePassword()) {
                    ResponseToko responseToko = new ResponseToko(etNamaToko.getText().toString(), user ,etAlamatToko.getText().toString());


                    ApiService apiService = Network.getInstance().create(ApiService.class);
                    apiService.registToko(responseToko).enqueue(new Callback<ResponseClass>() {
                        @Override
                        public void onResponse(Call<ResponseClass> call, Response<ResponseClass> response) {
                            if (response.body() != null) {
                                Toast.makeText(RegistToko.this, "Registration successful", Toast.LENGTH_SHORT).show();
                                finish();
                            } else {
                                Toast.makeText(RegistToko.this, "something went wrong! please try again", Toast.LENGTH_SHORT).show();
                            }
                        }

                        @Override
                        public void onFailure(Call<ResponseClass> call, Throwable t) {

                        }
                    });


                }

            }
        });
    }

    private boolean validatePassword() {
        if (TextUtils.isEmpty(etAlamatToko.getText().toString())) {
            etAlamatToko.setError("Nama Alamat Toko Tidak Bisa Kosong!!");
            etAlamatToko.requestFocus();
            return false;
        }
        return true;
    }

    private boolean validateUserName() {
        if (TextUtils.isEmpty(etNamaToko.getText().toString())) {
            etNamaToko.setError("Nama Toko tidak bisa kosong!!");
            etNamaToko.requestFocus();
            return false;
        }
        return true;
    }

    private void initializeListeners() {
        etNamaToko = findViewById(R.id.etNamaToko);
        etAlamatToko = findViewById(R.id.etAlamatToko);
        btnRegisterToko = findViewById(R.id.btnRegisterToko);
    }
}