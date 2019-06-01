package com.o_bdreldin.bookkeeper.repository.dao

import androidx.room.Delete
import androidx.room.Query
import com.o_bdreldin.bookkeeper.repository.BaseDao
import com.o_bdreldin.bookkeeper.repository.entity.Expense

/**
 * Created by Omar Bdreldin on 5/25/2019
 */
abstract class ExpenseDao : BaseDao<Expense>() {
    @Query("DELETE FROM Expense")
    abstract fun deleteAll(): Int
}