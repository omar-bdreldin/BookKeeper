package com.o_bdreldin.bookkeeper.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProviders
import com.o_bdreldin.bookkeeper.R
import com.o_bdreldin.bookkeeper.base.BaseFragment
import com.o_bdreldin.bookkeeper.databinding.MainFragmentBinding

class MainFragment : BaseFragment() {

    private var binding: MainFragmentBinding? = null

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

    override fun initObservers() {
    }

    override fun initViews(view: View) {
        binding = MainFragmentBinding.bind(view)
    }

    override fun initListeners() {
    }
}
