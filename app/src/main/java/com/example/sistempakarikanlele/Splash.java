package com.example.sistempakarikanlele;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class Splash extends AppCompatActivity {
    ImageView go;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        go = findViewById(R.id.go);


        go.setOnClickListener(v -> {
            Intent intent = new Intent(Splash.this, MainActivity.class);
            finish();
            startActivity(intent);
        });

    }
}