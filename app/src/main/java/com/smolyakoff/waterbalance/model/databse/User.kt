package com.smolyakoff.waterbalance.model.databse

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_data")
data class User(
    @PrimaryKey(autoGenerate = true)
    val id:Int,
    val name:String,
    val gender: String,
    val age:Int,
    val step:Int,
    val water_l:Float
)