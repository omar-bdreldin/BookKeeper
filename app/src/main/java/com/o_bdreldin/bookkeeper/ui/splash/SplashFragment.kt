package com.o_bdreldin.bookkeeper.ui.splash

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.animation.doOnEnd
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.o_bdreldin.bookkeeper.util.AnimationFactory
import com.o_bdreldin.bookkeeper.R
import com.o_bdreldin.bookkeeper.base.BaseFragment
import kotlinx.android.synthetic.main.splash_fragment.*

class SplashFragment : BaseFragment() {

    var navController : NavController? = null

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

    override fun initViews(view: View) {
        navController = findNavController()
    }

    override fun initListeners() {
    }

    override fun initObservers() {
    }

    override fun onResume() {
        super.onResume()
        AnimationFactory.createYRotationAnimation(logo_image_view)?.let {
            it.duration = 1000
            it.startDelay = 300
            it.doOnEnd {
                navController?.navigate(R.id.action_splashFragment_to_mainFragment)
            }
            it.start()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}
