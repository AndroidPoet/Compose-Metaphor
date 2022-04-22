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

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.runtime.Composable

/**
 * [Metaphor] allows to animate visibility with a material motion animation.
 * @param visible is state which will decide content animation(enter,exit)
 * @param enter EnterTransition defines how an AnimatedVisibility Composable appears on screen as it becomes visible
 * @param exit ExitTransition defines how an AnimatedVisibility Composable disappears on screen as it becomes not visible
 * @param easing MetaphorEasing Easing is a way to adjust an animation’s fraction.
 * @param enterDuration duration of the animation .
 * @param exitDuration duration of the animation .
 * @param delay delay of the animation .
 * @param delay delay of the animation .
 * @param [content] Content to appear or disappear based on the value of visible.
 */
@Composable
public fun Metaphor(
    visible: Boolean,
    enter: MetaphorEnterAnimation,
    exit: MetaphorExitAnimation,
    easing: MetaphorEasing,
    enterDuration: Int,
    exitDuration: Int,
    delay: Int,
    content: @Composable () -> Unit
) {
    AnimatedVisibility(
        visible = visible,
        enter = getMetaphorEnterAnimation(
            AnimationProp(
                enterDuration,
                exitDuration,
                delay,
                easing,
            ), enter
        ),
        exit = getMetaphorExitAnimation(
            AnimationProp(
                enterDuration,
                exitDuration,
                delay,
                easing,
            ), exit
        ),
    ) {
        content()
    }


}










