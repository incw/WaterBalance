package com.smolyakoff.waterbalance.model.databse

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface UserDao {


    @Query("SELECT * FROM user_data ORDER BY id ASC")
    fun readAllData(): LiveData<List<User>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addUser(user: User)

    @Update
    suspend fun update(user: User)

    @Delete
    suspend fun delete(user: User)

    @Query("DELETE FROM user_data")
    suspend fun deleteAllUser(user: User)


}