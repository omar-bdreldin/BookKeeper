package com.o_bdreldin.bookkeeper.repository.repo.expense

import android.app.Application
import com.o_bdreldin.bookkeeper.repository.BaseRepository
import com.o_bdreldin.bookkeeper.repository.DatabaseSingleton
import com.o_bdreldin.bookkeeper.repository.dao.ExpenseDao
import com.o_bdreldin.bookkeeper.repository.entity.Expense

/**
 * Created by Omar Bdreldin on 6/1/2019
 */
class ExpenseRepositoryImpl(private val dao: ExpenseDao?) : BaseRepository<Expense>(dao), ExpenseRepository {

    companion object {
        fun get(application: Application): ExpenseRepository? {
            return ExpenseRepositoryImpl(DatabaseSingleton.database(application)?.getExpenseDao())
        }
    }

    override fun deleteAll() {
        dao?.deleteAll()
    }
}