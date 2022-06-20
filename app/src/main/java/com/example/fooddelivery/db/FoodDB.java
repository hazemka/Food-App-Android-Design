package com.example.fooddelivery.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class FoodDB extends SQLiteOpenHelper{
    public Context context;
    public SQLiteDatabase db;
    public static int DATA_VERSION = 1;
    public static String DATA_NAME = "FoodDB";

    public FoodDB(Context context){
        super(context,DATA_NAME,null,DATA_VERSION);
        this.context = context;
    }

    {
        db = getReadableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
