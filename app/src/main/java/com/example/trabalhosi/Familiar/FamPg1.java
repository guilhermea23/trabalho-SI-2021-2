package com.example.trabalhosi.Familiar;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.trabalhosi.BD.Banco;
import com.example.trabalhosi.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.time.LocalDate;

public class FamPg1 extends AppCompatActivity {
    FloatingActionButton btnProx;
    Button p1Sim, p1Nao, p2Sim, p2Nao, p3Sim, p3Nao;
    TextView respostaP1, respostaP2, respostaP3;
    String p1, p2, p3;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fam_pg1);
        setTitle("Familiar - Página 1");
        btnProx = findViewById(R.id.btnProx);
        p1Sim = findViewById(R.id.p1Sim);
        p1Nao = findViewById(R.id.p1Nao);
        p2Sim = findViewById(R.id.p2Sim);
        p2Nao = findViewById(R.id.p2Nao);
        p3Sim = findViewById(R.id.p3Sim);
        p3Nao = findViewById(R.id.p3Nao);
        respostaP1 = findViewById(R.id.respostaP1);
        respostaP2 = findViewById(R.id.respostaP2);
        respostaP3 = findViewById(R.id.respostaP3);

        p1Sim.setOnClickListener(view -> {
            respostaP1.setText("Reposta atual: SIM");
            respostaP1.setTextColor(Color.parseColor("#74C812"));
            p1 = "S";
        });
        p1Nao.setOnClickListener(view -> {
            respostaP1.setText("Reposta atual: NÃO");
            respostaP1.setTextColor(Color.parseColor("#F44336"));
            p1 = "N";
        });
        p2Sim.setOnClickListener(view -> {
            respostaP2.setText("Reposta atual: SIM");
            respostaP2.setTextColor(Color.parseColor("#74C812"));
            p2 = "S";
        });
        p2Nao.setOnClickListener(view -> {
            respostaP2.setText("Reposta atual: NÃO");
            respostaP2.setTextColor(Color.parseColor("#F44336"));
            p2 = "N";
        });
        p3Sim.setOnClickListener(view -> {
            respostaP3.setText("Reposta atual: SIM");
            respostaP3.setTextColor(Color.parseColor("#74C812"));
            p3 = "S";
        });
        p3Nao.setOnClickListener(view -> {
            respostaP3.setText("Reposta atual: NÃO");
            respostaP3.setTextColor(Color.parseColor("#F44336"));
            p3 = "N";
        });
        btnProx.setOnClickListener(view -> {
            salvar();
            Intent intent = new Intent(FamPg1.this, FamPg2.class);
            startActivity(intent);
            finish();
        });
    }

    private void salvar() {
        SQLiteDatabase db;
        Banco banco = new Banco(this);
        db = banco.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("data", String.valueOf(LocalDate.now()));
        values.put("p1", p1);
        values.put("p2", p2);
        values.put("p3", p3);
        db.insert("familiar", null, values);
    }
}