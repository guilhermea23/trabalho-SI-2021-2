package com.example.trabalhosi;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.trabalhosi.Cuidador.CuidPg1;
import com.example.trabalhosi.Familiar.FamPg1;
import com.example.trabalhosi.Medico.MedPg1;

public class MainActivity extends AppCompatActivity {
    Button btnCuidador, btnFamiliar, btnMedico;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Cuidados");
        btnCuidador = findViewById(R.id.btnCuidador);
        btnFamiliar = findViewById(R.id.btnFamiliar);
        btnMedico = findViewById(R.id.btnMedico);

        btnCuidador.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, CuidPg1.class);
            startActivity(intent);
        });

        btnFamiliar.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, FamPg1.class);
            startActivity(intent);
        });

        btnMedico.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, MedPg1.class)));

    }
}