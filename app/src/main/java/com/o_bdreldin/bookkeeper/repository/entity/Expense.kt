package com.o_bdreldin.bookkeeper.repository.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Created by Omar Bdreldin on 5/12/2019
 */
@Entity
class Expense {
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0

    var dayOfMonth: Int = 0
    var month: Int = 0
    var year: Int = 0

    var amount: Double? = null
    var name: String? = null
}
