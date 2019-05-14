package com.o_bdreldin.bookkeeper.ui.splash

import android.animation.Animator
import android.animation.ObjectAnimator
import android.animation.ValueAnimator
import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AccelerateDecelerateInterpolator
import android.view.animation.Animation

import com.o_bdreldin.bookkeeper.R
import com.o_bdreldin.bookkeeper.base.BaseFragment
import kotlinx.android.synthetic.main.splash_fragment.*

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

    override fun onResume() {
        super.onResume()
        startLogoAnimation()
    }

    private fun startLogoAnimation() {
        val animation = ObjectAnimator.ofFloat(logo_image_view, "rotationY", 0f, 360f)
        animation.duration = 1000
        animation.interpolator = AccelerateDecelerateInterpolator()
        animation.addListener(object : Animator.AnimatorListener {
            override fun onAnimationRepeat(animation: Animator?) {
            }
            override fun onAnimationEnd(animation: Animator?) {
            }
            override fun onAnimationStart(animation: Animator?) {
            }
            override fun onAnimationCancel(animation: Animator?) {
            }
        })
        animation.start()
    }
}
