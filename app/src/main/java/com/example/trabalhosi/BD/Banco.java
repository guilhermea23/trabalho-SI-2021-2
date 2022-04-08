package com.example.trabalhosi.BD;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Banco extends SQLiteOpenHelper {
    public Banco(Context context) {
        super(context, "cuidados", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String sql;
        sql = " CREATE TABLE IF NOT EXISTS cuidador (" +
                "  data date NOT NULL," +
                "  q1 varchar(1) NOT NULL," +
                "  q2 varchar(1) NOT NULL," +
                "  q3 varchar(1) NOT NULL," +
                "  sintomas varchar(30))";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO cuidador (sintomas, q3, q2, q1, data)" +
                "     VALUES ('N;N;N;N;N;S;N;S','S','S','S','2022-04-04')," +
                "            ('N;S;N;S;N;S;N;S','S','S','N','2022-04-05')," +
                "            ('S;S;N;S;N;N;S;S','N','S','S','2022-04-06')," +
                "            ('S;N;S;N;S;N;S;N','N','S','N','2022-04-07');";
        sqLiteDatabase.execSQL(sql);
        sql = "CREATE TABLE IF NOT EXISTS familiar (" +
                "    data DATE not null," +
                "    p1   VARCHAR (1)," +
                "    p2   VARCHAR (1)," +
                "    p3   VARCHAR (1));";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO familiar (p3, p2, p1, data) " +
                "     VALUES ('S','N','S','2022-04-07')," +
                "            ('N','S','N','2022-04-06')," +
                "            ('N','N','N','2022-04-05')," +
                "            ('S','S','S','2022-04-04');";
        sqLiteDatabase.execSQL(sql);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
