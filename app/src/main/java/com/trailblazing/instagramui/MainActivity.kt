package com.trailblazing.instagramui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.trailblazing.instagramui.ui.HomeScreen
import com.trailblazing.instagramui.ui.theme.InstagramUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            InstagramUITheme {
                HomeScreen()
            }
        }
    }
}