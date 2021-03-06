package com.example.teacher.db040802;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by teacher on 2017/4/8.
 */

public class MyHelper extends SQLiteOpenHelper {
    static final int version = 2;
    static final String dbname = "student.sqlite";
    public MyHelper(Context context) {
        super(context, dbname, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE \"phone1\" (\"ID\" INTEGER PRIMARY KEY  NOT NULL , \"Name\" VARCHAR, \"Tel\" VARCHAR, \"Addr\" VARCHAR, \"Email\" VARCHAR)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        if (oldVersion == 1 && newVersion == 2)
        {
            db.execSQL("ALTER TABLE \"main\".\"phone1\" ADD COLUMN \"Email\" VARCHAR");
        }
    }
}
