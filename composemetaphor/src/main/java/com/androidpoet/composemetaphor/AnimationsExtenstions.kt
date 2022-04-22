/*
 * Copyright 2022 AndroidPoet (Ranbir Singh)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.androidpoet.composemetaphor

import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.Easing
import androidx.compose.animation.core.FastOutLinearInEasing
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.animation.expandHorizontally
import androidx.compose.animation.expandIn
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.scaleIn
import androidx.compose.animation.scaleOut
import androidx.compose.animation.shrinkHorizontally
import androidx.compose.animation.shrinkOut
import androidx.compose.animation.shrinkVertically
import androidx.compose.animation.slideIn
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOut
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.animation.slideOutVertically
import androidx.compose.ui.unit.IntOffset

/*[getMetaphorEnterAnimation] will return enter animation instance ont he basis of enum selection */
@OptIn(ExperimentalAnimationApi::class)
@JvmSynthetic
@PublishedApi
internal fun getMetaphorEnterAnimation(
    animationProp: AnimationProp,
    enterAnimation: MetaphorEnterAnimation
): EnterTransition {
    when (enterAnimation) {
        MetaphorEnterAnimation.FadeIn -> {
            return fadeIn(
                animationSpec = tween(
                    durationMillis = animationProp.enterDuration,
                    delayMillis = animationProp.delay,
                    easing = getMetaphorEasing(animationProp.metaphorEasing)
                ),

                )
        }
        MetaphorEnterAnimation.SharedAxisXForward -> {

            return slideInHorizontally(
                animationSpec = tween(
                    durationMillis = animationProp.enterDuration,
                    delayMillis = animationProp.delay,
                    easing = getMetaphorEasing(animationProp.metaphorEasing)
                )
            ) + fadeIn(
                animationSpec = tween(
                    durationMillis = animationProp.exitDuration,
                    delayMillis = animationProp.delay,
                    easing = getMetaphorEasing(animationProp.metaphorEasing)
                ),


                )
        }

        MetaphorEnterAnimation.SharedAxisYForward -> {

            return slideInVertically(
                animationSpec = tween(
                    durationMillis = animationProp.enterDuration,
                    delayMillis = animationProp.delay,
                    easing = getMetaphorEasing(animationProp.metaphorEasing)
                )
            ) + fadeIn(
                animationSpec = tween(
                    durationMillis = animationProp.enterDuration,
                    delayMillis = animationProp.delay,
                    easing = getMetaphorEasing(animationProp.metaphorEasing)
                )
            )
        }

        MetaphorEnterAnimation.SharedAxisZForward -> {

            return fadeIn(
                animationSpec = tween(
                    durationMillis = animationProp.enterDuration,
                    delayMillis = animationProp.delay,
                    easing = getMetaphorEasing(animationProp.metaphorEasing)
                )
            ) + scaleIn(
                animationSpec = tween(
                    durationMillis = animationProp.enterDuration,
                    delayMillis = animationProp.delay,
                    easing = getMetaphorEasing(animationProp.metaphorEasing)
                )
            )
        }

        MetaphorEnterAnimation.ElevationScale -> {
            return fadeIn(
                animationSpec = tween(
                    durationMillis = animationProp.enterDuration,
                    delayMillis = animationProp.delay,
                    easing = getMetaphorEasing(animationProp.metaphorEasing)
                )
            ) + scaleIn(
                animationSpec = tween(
                    durationMillis = animationProp.enterDuration,
                    delayMillis = animationProp.delay,
                    easing = getMetaphorEasing(animationProp.metaphorEasing)
                )
            )
        }


        MetaphorEnterAnimation.SlideIn -> {
            return slideIn(
                animationSpec = tween(

                    durationMillis = animationProp.enterDuration,
                    delayMillis = animationProp.delay,
                    easing = getMetaphorEasing(animationProp.metaphorEasing)

                ),
                initialOffset = { fullSize ->
                    IntOffset(
                        fullSize.width / 2,
                        fullSize.height / 2
                    )
                }


            )


        }


        MetaphorEnterAnimation.SlideInHorizontally -> {
            return slideInVertically(
                animationSpec = tween(

                    durationMillis = animationProp.enterDuration,
                    delayMillis = animationProp.delay,
                    easing = getMetaphorEasing(animationProp.metaphorEasing)

                )


            )


        }


        MetaphorEnterAnimation.SlideInVertically -> {
            return slideInVertically(
                animationSpec = tween(

                    durationMillis = animationProp.enterDuration,
                    delayMillis = animationProp.delay,
                    easing = getMetaphorEasing(animationProp.metaphorEasing)

                )


            )


        }


        MetaphorEnterAnimation.ScaleIn -> {
            return scaleIn(
                animationSpec = tween(

                    durationMillis = animationProp.enterDuration,
                    delayMillis = animationProp.delay,
                    easing = getMetaphorEasing(animationProp.metaphorEasing)

                )


            )


        }


        MetaphorEnterAnimation.ExpandIn -> {
            return expandIn(
                animationSpec = tween(

                    durationMillis = animationProp.enterDuration,
                    delayMillis = animationProp.delay,
                    easing = getMetaphorEasing(animationProp.metaphorEasing)

                )


            )


        }


        MetaphorEnterAnimation.ExpandHorizontally -> {
            return expandHorizontally(
                animationSpec = tween(

                    durationMillis = animationProp.enterDuration,
                    delayMillis = animationProp.delay,
                    easing = getMetaphorEasing(animationProp.metaphorEasing)

                )


            )


        }


        MetaphorEnterAnimation.ExpandVertically -> {
            return expandVertically(
                animationSpec = tween(

                    durationMillis = animationProp.enterDuration,
                    delayMillis = animationProp.delay,
                    easing = getMetaphorEasing(animationProp.metaphorEasing)

                )


            )


        }


    }
}


/*[getMetaphorExitAnimation] will return exit animation instance ont he basis of enum selection */
@OptIn(ExperimentalAnimationApi::class)
@JvmSynthetic
@PublishedApi
internal fun getMetaphorExitAnimation(
    animationProp: AnimationProp,
    enterAnimation: MetaphorExitAnimation
): ExitTransition {

    when (enterAnimation) {

        MetaphorExitAnimation.FadeOut -> {
            return fadeOut(
                animationSpec = tween(
                    durationMillis = animationProp.exitDuration,
                    delayMillis = animationProp.delay,
                    easing = getMetaphorEasing(animationProp.metaphorEasing)
                )
            )
        }
        MetaphorExitAnimation.SharedAxisXBackward -> {

            return slideOutHorizontally(
                animationSpec = tween(
                    durationMillis = animationProp.exitDuration,
                    delayMillis = animationProp.delay,
                    easing = getMetaphorEasing(animationProp.metaphorEasing)
                )
            ) + fadeOut(
                animationSpec = tween(
                    durationMillis = animationProp.exitDuration,
                    delayMillis = animationProp.delay,
                    easing = getMetaphorEasing(animationProp.metaphorEasing)
                )
            )
        }

        MetaphorExitAnimation.SharedAxisYBackward -> {
            return slideOutVertically(
                animationSpec = tween(
                    durationMillis = animationProp.exitDuration,
                    delayMillis = animationProp.delay,
                    easing = getMetaphorEasing(animationProp.metaphorEasing)
                )
            ) + fadeOut(
                animationSpec = tween(
                    durationMillis = animationProp.exitDuration,
                    delayMillis = animationProp.delay,
                    easing = getMetaphorEasing(animationProp.metaphorEasing)
                )
            )
        }

        MetaphorExitAnimation.SharedAxisZBackward -> {

            return fadeOut(
                animationSpec = tween(
                    durationMillis = animationProp.exitDuration,
                    delayMillis = animationProp.delay,
                    easing = getMetaphorEasing(animationProp.metaphorEasing)
                )
            ) + scaleOut(
                animationSpec = tween(
                    durationMillis = animationProp.exitDuration,
                    delayMillis = animationProp.delay,
                    easing = getMetaphorEasing(animationProp.metaphorEasing)
                )
            )
        }

        MetaphorExitAnimation.ElevationScale -> {
            return fadeOut(
                animationSpec = tween(
                    durationMillis = animationProp.exitDuration,
                    delayMillis = animationProp.delay,
                    easing = getMetaphorEasing(animationProp.metaphorEasing)
                )
            ) + scaleOut(
                animationSpec = tween(
                    durationMillis = animationProp.exitDuration,
                    delayMillis = animationProp.delay,
                    easing = getMetaphorEasing(animationProp.metaphorEasing)
                )
            )
        }


        MetaphorExitAnimation.SlideOut -> {
            return slideOut(

                targetOffset = { fullSize ->
                    IntOffset(
                        -fullSize.width / 2,
                        fullSize.height / 2
                    )
                },

                animationSpec = tween(
                    durationMillis = animationProp.exitDuration,
                    delayMillis = animationProp.delay,
                    easing = getMetaphorEasing(animationProp.metaphorEasing)
                )
            )


        }


        MetaphorExitAnimation.SlideOutHorizontally -> {
            return slideOutHorizontally(
                animationSpec = tween(
                    durationMillis = animationProp.exitDuration,
                    delayMillis = animationProp.delay,
                    easing = getMetaphorEasing(animationProp.metaphorEasing)
                )
            )


        }
        MetaphorExitAnimation.SlideOutVertically -> {
            return slideOutVertically(
                animationSpec = tween(
                    durationMillis = animationProp.exitDuration,
                    delayMillis = animationProp.delay,
                    easing = getMetaphorEasing(animationProp.metaphorEasing)
                )
            )


        }


        MetaphorExitAnimation.ScaleOut -> {
            return scaleOut(
                animationSpec = tween(
                    durationMillis = animationProp.exitDuration,
                    delayMillis = animationProp.delay,
                    easing = getMetaphorEasing(animationProp.metaphorEasing)
                )
            )


        }


        MetaphorExitAnimation.ShrinkOut -> {
            return shrinkOut(
                animationSpec = tween(
                    durationMillis = animationProp.exitDuration,
                    delayMillis = animationProp.delay,
                    easing = getMetaphorEasing(animationProp.metaphorEasing)
                )
            )


        }


        MetaphorExitAnimation.ShrinkHorizontally -> {
            return shrinkHorizontally(
                animationSpec = tween(
                    durationMillis = animationProp.exitDuration,
                    delayMillis = animationProp.delay,
                    easing = getMetaphorEasing(animationProp.metaphorEasing)
                )
            )


        }

        MetaphorExitAnimation.ShrinkVertically -> {
            return shrinkVertically(
                animationSpec = tween(
                    durationMillis = animationProp.exitDuration,
                    delayMillis = animationProp.delay,
                    easing = getMetaphorEasing(animationProp.metaphorEasing)
                )
            )


        }

    }

}


/*[getMetaphorEasing] will return easing instance to perform animation  on the  basis of enum selection */
@OptIn(ExperimentalAnimationApi::class)
@JvmSynthetic
@PublishedApi
internal fun getMetaphorEasing(enterAnimation: MetaphorEasing): Easing {

    when (enterAnimation) {

        MetaphorEasing.FastOutSlowInEasing -> {

            return FastOutSlowInEasing
        }

        MetaphorEasing.LinearEasing -> {
            return LinearEasing
        }

        MetaphorEasing.FastOutLinearInEasing -> {

            return FastOutLinearInEasing
        }

        MetaphorEasing.LinearOutSlowInEasing -> {
            return LinearOutSlowInEasing
        }


    }

}