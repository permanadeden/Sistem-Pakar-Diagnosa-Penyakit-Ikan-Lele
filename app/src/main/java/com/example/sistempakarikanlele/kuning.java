package com.example.sistempakarikanlele;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class kuning extends AppCompatActivity {
    ImageView back, home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuning);

        back = findViewById(R.id.back);
        home = findViewById(R.id.home);


        back.setOnClickListener(v -> {
            Intent intent = new Intent(kuning.this, datapenyakit.class);
            finish();
            startActivity(intent);
        });
        home.setOnClickListener(v -> {
            Intent intent = new Intent(kuning.this, Splash.class);
            finish();
            startActivity(intent);
        });
    }
}