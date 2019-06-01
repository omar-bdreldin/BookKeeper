package com.o_bdreldin.bookkeeper.repository

import android.app.Application
import androidx.room.Room
import androidx.room.RoomDatabase

/**
 * Created by Omar Bdreldin on 6/1/2019
 */
class GenericDatabaseWrapper<T : RoomDatabase> {
    lateinit var database: T
    companion object {
        fun <T : RoomDatabase> get(application: Application, aClass: Class<T>, name: String): GenericDatabaseWrapper<T> {
            val wrapper: GenericDatabaseWrapper<T> = GenericDatabaseWrapper()
            wrapper.database = Room.databaseBuilder(application, aClass, name).build()
            return wrapper
        }
    }
}