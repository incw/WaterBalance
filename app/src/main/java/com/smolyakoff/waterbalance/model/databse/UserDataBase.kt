package com.smolyakoff.waterbalance.model.databse

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.internal.synchronized


@Database(
    entities = [User::class],
    version = 1,
    exportSchema = false
)

abstract class UserDataBase : RoomDatabase() {


    abstract fun userDao(): UserDao

    companion object {

        @Volatile
        private var INSTANCE: UserDataBase? = null

        @InternalCoroutinesApi
        fun getDataBase(context: Context): UserDataBase {
            val tempInstance = INSTANCE

            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    UserDataBase::class.java,
                    "user_database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }

}