package com.smolyakoff.waterbalance.model.databse

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DbHelper(context: Context) :SQLiteOpenHelper(
        context,BaseNameClass.DATABASE_NAME,null,
    BaseNameClass.DATABASE_VERSION
){

    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL(BaseNameClass.CREATE_TABLE)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db?.execSQL(BaseNameClass.SQL_DELETE_TABLE)
        onCreate(db)
    }

}