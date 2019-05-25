package com.o_bdreldin.bookkeeper

import android.animation.ObjectAnimator
import android.view.View

/**
 * Created by Omar Bdreldin on 5/15/2019
 */
class AnimationFactory {
    companion object {
        fun createYRotatationAniamtion(view : View) : ObjectAnimator? {
            return ObjectAnimator.ofFloat(view, "rotationY", 0f, 360f)
        }
    }
}