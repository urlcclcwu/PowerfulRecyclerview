package com.maoamade.powerfulrecy.animation.baseanimation

import android.animation.Animator
import android.animation.ObjectAnimator
import android.view.View
import android.view.animation.DecelerateInterpolator
import com.maoamade.powerfulrecy.animation.BaseAnimation

/**

 * @Author maoamade

 * @Date 2021/6/29 11:02 AM

 * @Info SlideInBottomAnimation.kt

 */
class SlideInBottomAnimation :BaseAnimation{

    override fun animators(view: View): Array<Animator> {
        val animator = ObjectAnimator.ofFloat(view,"TranslationY",view.measuredHeight.toFloat(),0f)
        animator.duration = 400
        animator.interpolator = DecelerateInterpolator(1.3f)
        return arrayOf(animator)
    }
}