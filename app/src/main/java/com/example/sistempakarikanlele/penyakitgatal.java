package com.example.sistempakarikanlele;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class penyakitgatal extends AppCompatActivity {
    ImageView back, home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penyakitgatal);

        back = findViewById(R.id.back);
        home = findViewById(R.id.home);


        back.setOnClickListener(v -> {
            Intent intent = new Intent(penyakitgatal.this, datapenyakit.class);
            finish();
            startActivity(intent);
        });
        home.setOnClickListener(v -> {
            Intent intent = new Intent(penyakitgatal.this, Splash.class);
            finish();
            startActivity(intent);
        });
    }
}