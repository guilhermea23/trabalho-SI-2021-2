package com.example.trabalhosi.Cuidador;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.trabalhosi.MainActivity;
import com.example.trabalhosi.R;

public class CuidPg3 extends AppCompatActivity {
    Button btnFinalizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuid_pg3);
        setTitle("Cuidador - Página 3");

        btnFinalizar = findViewById(R.id.btnFinalizar);
        btnFinalizar.setOnClickListener(view -> {
            startActivity(new Intent(CuidPg3.this, MainActivity.class));
            finish();
        });
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(CuidPg3.this, MainActivity.class));
        super.onBackPressed();
    }
}