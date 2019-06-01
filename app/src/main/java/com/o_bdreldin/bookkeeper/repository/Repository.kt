package com.o_bdreldin.bookkeeper.repository

interface Repository<T> {
    
    fun insert(vararg o: T)
    fun delete(vararg o: T)
    fun update(vararg o: T)
}