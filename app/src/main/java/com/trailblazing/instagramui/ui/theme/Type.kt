package com.trailblazing.instagramui.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.trailblazing.instagramui.R

val inter = FontFamily(
    listOf(
        Font(R.font.inter_regular, FontWeight.Normal),
        Font(R.font.inter_medium, FontWeight.Medium),
        Font(R.font.inter_bold, FontWeight.Bold),
    )
)

val billabong = FontFamily(
    listOf(
        Font(R.font.billabong_regular, FontWeight.Normal)
    )
)

// Set of Material typography styles to start with
val Typography = Typography(
    body1 = TextStyle(
        color = Black,
        fontFamily = inter,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    ),
    body2 = TextStyle(
        color = Black,
        fontFamily = inter,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    ),
    h1 = TextStyle(
        color = Black,
        fontFamily = billabong,
        fontSize = 30.sp
    ),
    h2 = TextStyle(
        color = Black,
        fontFamily = inter,
        fontWeight = FontWeight.Bold,
        fontSize = 18.sp
    ),

    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)
