package com.example.sistempakarikanlele;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class datapenyakit extends AppCompatActivity {
    ImageView back, home, penyakit1, penyakit2, penyakit3, penyakit4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datapenyakit);

        penyakit1 = findViewById(R.id.penyakit1);
        penyakit2 = findViewById(R.id.penyakit2);
        penyakit3 = findViewById(R.id.penyakit3);
        penyakit4 = findViewById(R.id.penyakit4);
        home = findViewById(R.id.home);
        back = findViewById(R.id.back);


        penyakit1.setOnClickListener(v -> {
            Intent intent = new Intent(datapenyakit.this, bintikputih.class);
            finish();
            startActivity(intent);
        });

        penyakit2.setOnClickListener(v -> {
            Intent intent = new Intent(datapenyakit.this, penyakitgatal.class);
            finish();
            startActivity(intent);
        });

        penyakit3.setOnClickListener(v -> {
            Intent intent = new Intent(datapenyakit.this, catton.class);
            finish();
            startActivity(intent);
        });

        penyakit4.setOnClickListener(v -> {
            Intent intent = new Intent(datapenyakit.this, kuning.class);
            finish();
            startActivity(intent);
        });

        home.setOnClickListener(v -> {
            Intent intent = new Intent(datapenyakit.this, Splash.class);
            finish();
            startActivity(intent);
        });

        back.setOnClickListener(v -> {
            Intent intent = new Intent(datapenyakit.this, MainActivity.class);
            finish();
            startActivity(intent);
        });
    }
}