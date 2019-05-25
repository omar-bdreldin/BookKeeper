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
    abstract fun insert(o: T) : Long
    @Insert
    abstract fun insert(list: List<T>) : LongArray
    @Delete
    abstract fun delete(o: T) : Int
    @Update(onConflict = OnConflictStrategy.ABORT)
    abstract fun update(o: T)
}