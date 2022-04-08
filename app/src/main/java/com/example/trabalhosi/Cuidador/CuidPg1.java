package com.example.trabalhosi.Cuidador;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.trabalhosi.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class CuidPg1 extends AppCompatActivity {
    FloatingActionButton btnProx;
    Button q1Sim, q1Nao, q2Sim, q2Nao, q3Sim, q3Nao;
    TextView respostaQ1, respostaQ2, respostaQ3;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuid_pg1);
        setTitle("Cuidador - Página 1");

        btnProx = findViewById(R.id.btnProx);
        q1Sim = findViewById(R.id.q1Sim);
        q1Nao = findViewById(R.id.q1Nao);
        q2Sim = findViewById(R.id.q2Sim);
        q2Nao = findViewById(R.id.q2Nao);
        q3Sim = findViewById(R.id.q3Sim);
        q3Nao = findViewById(R.id.q3Nao);
        respostaQ1 = findViewById(R.id.respostaQ1);
        respostaQ2 = findViewById(R.id.respostaQ2);
        respostaQ3 = findViewById(R.id.respostaQ3);

        q1Sim.setOnClickListener(view -> {
            respostaQ1.setText("Reposta atual: SIM");
            respostaQ1.setTextColor(Color.parseColor("#74C812"));
            CuidPg2.q1 = "S";
        });
        q1Nao.setOnClickListener(view -> {
            respostaQ1.setText("Reposta atual: NÃO");
            respostaQ1.setTextColor(Color.parseColor("#F44336"));
            CuidPg2.q1 = "N";
        });
        q2Sim.setOnClickListener(view -> {
            respostaQ2.setText("Reposta atual: SIM");
            respostaQ2.setTextColor(Color.parseColor("#74C812"));
            CuidPg2.q2 = "S";
        });
        q2Nao.setOnClickListener(view -> {
            respostaQ2.setText("Reposta atual: NÃO");
            respostaQ2.setTextColor(Color.parseColor("#F44336"));
            CuidPg2.q2 = "N";
        });
        q3Sim.setOnClickListener(view -> {
            respostaQ3.setText("Reposta atual: SIM");
            respostaQ3.setTextColor(Color.parseColor("#74C812"));
            CuidPg2.q3 = "S";
        });
        q3Nao.setOnClickListener(view -> {
            respostaQ3.setText("Reposta atual: NÃO");
            respostaQ3.setTextColor(Color.parseColor("#F44336"));
            CuidPg2.q3 = "N";
        });
        btnProx.setOnClickListener(view -> {
            Intent intent = new Intent(CuidPg1.this, CuidPg2.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
            startActivity(intent);
        });
    }
}