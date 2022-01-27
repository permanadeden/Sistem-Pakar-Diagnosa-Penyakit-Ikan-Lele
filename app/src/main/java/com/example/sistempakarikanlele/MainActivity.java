package com.example.sistempakarikanlele;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView data, petunjuk, tentang, home, diagnosa, informasipakar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        data = findViewById(R.id.data);
        diagnosa = findViewById(R.id.diagnosa);
        informasipakar = findViewById(R.id.informasipakar);
        petunjuk = findViewById(R.id.petunjuk);
        tentang = findViewById(R.id.tentang);
        home = findViewById(R.id.home);

        data.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, datapenyakit.class);
            finish();
            startActivity(intent);
        });

        diagnosa.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, desk.class);
            intent.putExtra("id","G001");
            startActivity(intent);
            finish();
        });

        informasipakar.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, informasipakar.class);
            finish();
            startActivity(intent);
        });

        petunjuk.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, petunjuk.class);
            finish();
            startActivity(intent);
        });

        tentang.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Tentang.class);
            finish();
            startActivity(intent);
        });

        home.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Splash.class);
            finish();
            startActivity(intent);
        });
    }
}