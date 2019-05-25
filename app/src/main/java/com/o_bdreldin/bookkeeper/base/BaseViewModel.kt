package com.o_bdreldin.bookkeeper.base

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.o_bdreldin.bookkeeper.repository.Repository
import com.o_bdreldin.bookkeeper.repository.Repository_Impl_1
import io.reactivex.disposables.CompositeDisposable

abstract class BaseViewModel : AndroidViewModel {

    protected val disposables = CompositeDisposable()

    protected val repository : Repository

    constructor(application: Application) : super(application) {
        repository = Repository_Impl_1(application)
    }
}