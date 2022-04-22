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

/** MetaphorExitAnimation is the collection of the exit animations. */
public enum class MetaphorExitAnimation(public val value: Int) {

    FadeOut(1),
    SharedAxisXBackward(2),
    SharedAxisYBackward(3),
    SharedAxisZBackward(4),
    ElevationScale(5),
    SlideOut(6),
    SlideOutHorizontally(7),
    SlideOutVertically(8),
    ScaleOut(9),
    ShrinkOut(10),
    ShrinkHorizontally(11),
    ShrinkVertically(12)

}