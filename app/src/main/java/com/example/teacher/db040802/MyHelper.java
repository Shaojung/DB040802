package com.example.teacher.db040802;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by teacher on 2017/4/8.
 */

public class MyHelper extends SQLiteOpenHelper {
    static final int version = 1;
    static final String dbname = "student.sqlite";
    public MyHelper(Context context) {
        super(context, dbname, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE  TABLE \"phone1\" (\"ID\" INTEGER PRIMARY KEY  NOT NULL , \"Name\" VARCHAR, \"Tel\" VARCHAR, \"Addr\" VARCHAR)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
