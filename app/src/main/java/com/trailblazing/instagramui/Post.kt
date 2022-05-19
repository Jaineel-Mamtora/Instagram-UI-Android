package com.trailblazing.instagramui

import androidx.annotation.DrawableRes

data class Post(
    val username: String,
    @DrawableRes val iconId: Int,
    @DrawableRes val imageId: Int,
)
