package com.o_bdreldin.bookkeeper.base

import android.os.Bundle
import androidx.fragment.app.Fragment

abstract class BaseFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViewModel()
        initViews()
        initListeners()
        initObservers()
    }

    protected abstract fun initViewModel()
    protected abstract fun initViews()
    protected abstract fun initListeners()
    protected abstract fun initObservers()
}