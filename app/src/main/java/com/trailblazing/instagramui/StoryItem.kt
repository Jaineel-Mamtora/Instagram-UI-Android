package com.trailblazing.instagramui

import androidx.annotation.DrawableRes

data class StoryItem(
    val userName: String,
    @DrawableRes val iconId: Int
)
