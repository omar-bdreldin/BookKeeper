package com.o_bdreldin.bookkeeper.repository

import androidx.room.Database
import androidx.room.RoomDatabase
import com.o_bdreldin.bookkeeper.repository.dao.ExpenseDao
import com.o_bdreldin.bookkeeper.repository.entity.Expense

/**
 * Created by Omar Bdreldin on 6/1/2019
 */
@Database(entities = [Expense::class], version = 1, exportSchema = false)
abstract class MyDatabase : RoomDatabase() {
    abstract fun getExpenseDao(): ExpenseDao
}