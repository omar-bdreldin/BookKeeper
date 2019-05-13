package com.o_bdreldin.bookkeeper.ui.main

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.o_bdreldin.bookkeeper.R
import com.o_bdreldin.bookkeeper.base.BaseFragment

class MainFragment : BaseFragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun initViewModel() {
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
    }

    override fun initViews() {
    }

    override fun initListeners() {
    }

    override fun initObservers() {
    }
}
