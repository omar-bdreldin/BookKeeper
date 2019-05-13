package com.o_bdreldin.bookkeeper.ui.splash

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.o_bdreldin.bookkeeper.R
import com.o_bdreldin.bookkeeper.base.BaseFragment

class SplashFragment : BaseFragment() {

    companion object {
        fun newInstance() = SplashFragment()
    }

    private lateinit var viewModel: SplashViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.splash_fragment, container, false)
    }

    override fun initViewModel() {
        viewModel = ViewModelProviders.of(this).get(SplashViewModel::class.java)
    }

    override fun initViews() {

    }
    override fun initListeners() {
    }

    override fun initObservers() {
    }

}
