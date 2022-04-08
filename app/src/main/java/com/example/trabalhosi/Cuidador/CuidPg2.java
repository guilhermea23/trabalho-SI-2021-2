package com.example.trabalhosi.Cuidador;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.trabalhosi.BD.Banco;
import com.example.trabalhosi.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.time.LocalDate;

public class CuidPg2 extends AppCompatActivity {
    FloatingActionButton btnProx, btnAnt;
    public static String q1, q2, q3, sintomas;
    CheckBox ck1, ck2, ck3, ck4, ck5, ck6, ck7, ck8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuid_pg2);
        setTitle("Cuidador - Página 2");

        btnProx = findViewById(R.id.btnProx);
        btnAnt = findViewById(R.id.btnAnt);
        ck1 = findViewById(R.id.ck1);
        ck2 = findViewById(R.id.ck2);
        ck3 = findViewById(R.id.ck3);
        ck4 = findViewById(R.id.ck4);
        ck5 = findViewById(R.id.ck5);
        ck6 = findViewById(R.id.ck6);
        ck7 = findViewById(R.id.ck7);
        ck8 = findViewById(R.id.ck8);

        btnProx.setOnClickListener(view -> {
            salvar();
            startActivity(new Intent(CuidPg2.this, CuidPg3.class));
            finishAffinity();
        });
        btnAnt.setOnClickListener(view -> {
            Intent intent = new Intent(CuidPg2.this, CuidPg1.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
            startActivity(intent);
        });
    }

    private void salvar() {
        verificarSintomas();
        try {
            SQLiteDatabase db;
            Banco banco = new Banco(this);
            db = banco.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("data", String.valueOf(LocalDate.now()));
            contentValues.put("q1", q1);
            contentValues.put("q2", q2);
            contentValues.put("q3", q3);
            contentValues.put("sintomas", sintomas);
            db.insert("cuidador", null, contentValues);
            db.close();
        } catch (Exception e) {
            Toast.makeText(this, "" + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    private void verificarSintomas() {
        sintomas = "";
        sintomas = valorCK(ck1) + ";" + valorCK(ck2) + ";" + valorCK(ck3) + ";" + valorCK(ck4) + ";" + valorCK(ck5) + ";" +
                valorCK(ck6) + ";" + valorCK(ck7) + ";" + valorCK(ck8);
    }

    private String valorCK(CheckBox ck) {
        if (ck.isChecked())
            return "S";
        else
            return "N";
    }
}