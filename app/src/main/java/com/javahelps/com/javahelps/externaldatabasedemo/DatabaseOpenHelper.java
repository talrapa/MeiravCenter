package com.javahelps.com.javahelps.externaldatabasedemo;

import android.content.Context;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;
/**
 * Created by User on 17/03/2018.
 */

class DatabaseOpenHelper extends SQLiteAssetHelper {

    private static final String DATABASE_NAME = "Meirav.db";
    private static final int DATABASE_VERSION = 1;

    public DatabaseOpenHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

}




