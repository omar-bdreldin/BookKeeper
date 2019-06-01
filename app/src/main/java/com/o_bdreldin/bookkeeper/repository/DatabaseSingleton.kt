package com.o_bdreldin.bookkeeper.repository

import android.app.Application

/**
 * Created by Omar Bdreldin on 6/1/2019
 */
object DatabaseSingleton {
    val DATABASE_NAME = "book_keeper"
    var wrapper: GenericDatabaseWrapper<MyDatabase>? = null

    fun database(application: Application): MyDatabase? {
        if (wrapper == null)
            wrapper = GenericDatabaseWrapper.get(application, MyDatabase::class.java, DATABASE_NAME)
        return wrapper?.database
    }
}