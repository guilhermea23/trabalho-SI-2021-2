package com.example.trabalhosi.Medico;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.Spanned;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.text.HtmlCompat;

import com.example.trabalhosi.BD.Banco;
import com.example.trabalhosi.R;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MedPg1 extends AppCompatActivity {
    TextView tvRelatorio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_med_pg1);
        tvRelatorio = findViewById(R.id.tvRelatorio);
        preencherRelatorio();
    }

    @SuppressLint("Recycle")
    private void preencherRelatorio() {
        try {
            @SuppressLint("SimpleDateFormat") SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            @SuppressLint("SimpleDateFormat") SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
            Banco banco = new Banco(this);
            SQLiteDatabase db;
            db = banco.getReadableDatabase();
            Cursor cursor, cursor1;
            cursor = db.query("cuidador", null, null, null, null, null, null);
            StringBuilder texto = new StringBuilder();
            while (cursor.moveToNext()) {
                cursor1 = db.rawQuery("SELECT * FROM familiar WHERE data = '" + cursor.getString(0) + "'", null);
                Date data = dateFormat2.parse(cursor.getString(0));
                assert data != null;
                texto.append("<h3>&emsp;").append(dateFormat.format(data)).append("</h3>");
                if (cursor1.moveToFirst()) {
                    texto.append("&emsp;<b>Familiar:</b><br>");
                    if (cursor1.getString(1).equals("S")) {
                        if (cursor1.getString(2).equals("S"))
                            texto.append("&emsp;&emsp; - Apresentou perda de memória recorrente<br>");
                        else
                            texto.append("&emsp;&emsp; - Apresentou perda de memória não recorrente<br>");
                    } else {
                        texto.append("&emsp;&emsp; - Não apresentou perda de memória<br>");
                    }
                    if (cursor1.getString(3).equals("S"))
                        texto.append("&emsp;&emsp; - Dormiu bem<br>");
                    else
                        texto.append("&emsp;&emsp; - Não dormiu bem<br>");
                }
                texto.append("&emsp;<b>Cuidador:</b><br>");
                if (cursor.getString(1).equals("N"))
                    texto.append("&emsp;&emsp; - Não estava bem<br>");
                else
                    texto.append("&emsp;&emsp; - Estava bem<br>");
                if (cursor.getString(2).equals("S"))
                    texto.append("&emsp;&emsp; - Apresentou comportamento estranho<br>");
                else
                    texto.append("&emsp;&emsp; - Não apresentou comportamento estranho<br>");
                if (cursor.getString(3).equals("N"))
                    texto.append("&emsp;&emsp; - Não dormiu bem<br>");
                else
                    texto.append("&emsp;&emsp; - Dormiu bem<br>");

                texto.append("&emsp;&emsp;&emsp;&emsp;Sintomas: <br>");
                String[] partes = cursor.getString(4).split(";");
                if (partes[0].equals("S"))
                    texto.append("&emsp;&emsp;&emsp;&emsp;&emsp; > Lentidão<br>");
                if (partes[1].equals("S"))
                    texto.append("&emsp;&emsp;&emsp;&emsp;&emsp; > Fala leve<br>");
                if (partes[2].equals("S"))
                    texto.append("&emsp;&emsp;&emsp;&emsp;&emsp; > Fraqueza<br>");
                if (partes[3].equals("S"))
                    texto.append("&emsp;&emsp;&emsp;&emsp;&emsp; > Pressão Alta<br>");
                if (partes[4].equals("S"))
                    texto.append("&emsp;&emsp;&emsp;&emsp;&emsp; > Pressão Baixa<br>");
                if (partes[5].equals("S"))
                    texto.append("&emsp;&emsp;&emsp;&emsp;&emsp; > Enjoo<br>");
                if (partes[6].equals("S"))
                    texto.append("&emsp;&emsp;&emsp;&emsp;&emsp; > Inchaço ou inflamação<br>");
                if (partes[7].equals("S"))
                    texto.append("&emsp;&emsp;&emsp;&emsp;&emsp; > Dor ou incomodo<br>");
                texto.append("<br><br>-------------------------------------------------------------------------------------");
            }
            Spanned spanned = HtmlCompat.fromHtml(texto.toString(), HtmlCompat.FROM_HTML_MODE_LEGACY);
            tvRelatorio.setText(spanned);
        } catch (Exception e) {
            Toast.makeText(this, "" + e.getMessage(), Toast.LENGTH_SHORT).show();
            Log.e("Erro:", e.getMessage());
        }
    }
}