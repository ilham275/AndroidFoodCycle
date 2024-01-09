package com.example.coba2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SuccessfulLogin extends AppCompatActivity {
    TextView tvUsername;
    Button btnRegistToko;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_successful_login);
        String username = getIntent().getStringExtra("username");
        int userId = getIntent().getIntExtra("idUser", 0);
        tvUsername = findViewById(R.id.tvUsername);
        btnRegistToko = findViewById(R.id.btnRegistToko);
        tvUsername.setText("Selamat Datang," + "  " + username);
        btnRegistToko.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SuccessfulLogin.this, RegistToko.class);
                intent.putExtra("idUser", userId);
                startActivity(intent);
            }
        });
    }
}
