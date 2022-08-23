package com.smolyakoff.waterbalance.model.databse

import android.provider.BaseColumns

object BaseNameClass {

    const val DATABASE_VERSION = 1
    const val DATABASE_NAME = "WaterBalance.db"

    private const val TABLE_NAME = "profile_info"
    const val COLUMN_NAME_TITLE = "title"
    const val COLUMN_NAME_NAME = "name"
    const val COLUMN_NAME_AGE = "age"
    const val COLUMN_NAME_WEIGHT = "weight"
    const val COLUMN_NAME_GENDER = "gender"
    const val COLUMN_NAME_TOTALWATER = "total_water"
    const val COLUMN_NAME_STEP = "step"

    const val CREATE_TABLE = "CREATE TABLE IF NOT EXISTS $TABLE_NAME (" +
            "${BaseColumns._ID} INTEGER PRIMARY KEY," +

            "$COLUMN_NAME_TITLE TEXT," +
            "$COLUMN_NAME_NAME TEXT" +
            "$COLUMN_NAME_AGE INTEGER" +
            "$COLUMN_NAME_WEIGHT INTEGER" +
            "$COLUMN_NAME_GENDER TEXT" +
            "$COLUMN_NAME_TOTALWATER REAL" +
            "$COLUMN_NAME_STEP INTEGER"

    const val SQL_DELETE_TABLE = "DROP TABLE IF EXISTS $TABLE_NAME"

}