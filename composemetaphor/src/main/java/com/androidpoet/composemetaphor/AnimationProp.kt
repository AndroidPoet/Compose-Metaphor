package com.androidpoet.composemetaphor

/*[AnimationProp] is properties of animation as compose has experimental apis we can change the internal code when needed.*/
public data class AnimationProp(
    val enterDuration: Int,
    val exitDuration: Int,
    val delay: Int,
    val metaphorEasing: MetaphorEasing,
    val initialAlpha: Float = 0.92f
)