package com.example.androidtrainingprogram.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.androidtrainingprogram.R

val inclusiveSansFontFamily = FontFamily(
    Font(R.font.inclusive_sans_regular, FontWeight.Normal),
    Font(R.font.inclusive_sans_regular, FontWeight.Bold),
    Font(R.font.inclusive_sans_italic, FontWeight.Normal, FontStyle.Italic),
)

// Set of Material typography styles to start with
val Typography = Typography(
    body1 = TextStyle(
        fontFamily = inclusiveSansFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    h1 = TextStyle(
        fontFamily = inclusiveSansFontFamily,
        fontStyle = FontStyle.Normal,
        fontSize = 48.sp
    )
)

//val MyCustomTextStyle = TextStyle(
//    fontFamily = inclusiveSansFontFamily,
//    fontWeight = FontWeight.Bold,
//    fontSize = 16.sp,
//    fontStyle = FontStyle.Italic,
//    lineHeight = 24.sp,
//    letterSpacing = 0.5.sp
//)