package com.o_bdreldin.bookkeeper.repository.repo.expense

import com.o_bdreldin.bookkeeper.repository.Repository
import com.o_bdreldin.bookkeeper.repository.entity.Expense

/**
 * Created by Omar Bdreldin on 6/1/2019
 */
interface ExpenseRepository : Repository<Expense> {
    fun deleteAll()
}