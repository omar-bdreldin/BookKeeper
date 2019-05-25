package com.o_bdreldin.bookkeeper.repository.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Created by Omar Bdreldin on 5/12/2019
 */
@Entity
class Expense {
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null
    var dayOfMonth: Int? = null
    var month: Int? = null
    var year: Int? = null
    var creationDate: Long? = null
    var amount: Double? = null
    var name: String? = null
}
