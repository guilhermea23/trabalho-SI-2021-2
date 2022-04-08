package com.example.trabalhosi.Familiar;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.trabalhosi.Medico.MedPg1;
import com.example.trabalhosi.R;

public class FamPg2 extends AppCompatActivity {
    Button btnVoltar, btnRelatorio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fam_pg2);
        setTitle("Familiar - Página 2");
        btnVoltar = findViewById(R.id.btnVoltar);
        btnRelatorio = findViewById(R.id.btnRelatorio);
        btnRelatorio.setOnClickListener(view -> {
            startActivity(new Intent(FamPg2.this, MedPg1.class));
            finish();
        });
        btnVoltar.setOnClickListener(view -> onBackPressed());
    }
}