package com.o_bdreldin.bookkeeper.repository

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Update

/**
 * Created by Omar Bdreldin on 5/25/2019
 */
abstract class BaseDao<T> {
    @Insert
    abstract fun insert(vararg o: T)
    @Delete
    abstract fun delete(vararg o: T)
    @Update
    abstract fun update(vararg o: T)
}