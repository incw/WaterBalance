package com.smolyakoff.waterbalance.model.databse

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_data")
data class User(

    @PrimaryKey(autoGenerate = true)
    val id: Int,

    @ColumnInfo(name = "name")
    val name: String,

    @ColumnInfo(name = "gender")
    val gender: String,

    @ColumnInfo(name = "weight")
    val weight: Float,

    @ColumnInfo(name = "age")
    val age: Int,

    @ColumnInfo(name = "step")
    val step: Int,

    @ColumnInfo(name = "water_l")
    val water_l: Float

)