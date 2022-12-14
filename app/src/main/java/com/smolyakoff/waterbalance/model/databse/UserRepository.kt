package com.smolyakoff.waterbalance.model.databse

import androidx.lifecycle.LiveData

class UserRepository(private val userDao: UserDao) {
    val readAllData: LiveData<List<User>> = userDao.readAllData()

    suspend fun addUser(user: User) {
        userDao.addUser(user)
    }

    suspend fun updateUser(user: User) {
        userDao.update(user)
    }

    suspend fun deleteUser(user: User) {
        userDao.deleteAllUser(user)
    }

    suspend fun deleteAllUser(user: User) {
        userDao.deleteAllUser(user)
    }
}