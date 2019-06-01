package com.o_bdreldin.bookkeeper.repository

/**
 * Created by Omar Bdreldin on 6/1/2019
 */
open class BaseRepository<T>(private var dao: BaseDao<T>?) : Repository<T> {

    override fun insert(vararg o: T) {
        dao?.insert(*o)
    }

    override fun delete(vararg o: T) {
        dao?.delete(*o)
    }

    override fun update(vararg o: T) {
        dao?.update(*o)
    }
}