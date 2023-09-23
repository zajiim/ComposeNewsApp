package com.example.composenewsapp.presentation.onboarding

import androidx.annotation.DrawableRes
import com.example.composenewsapp.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int
)

val pages = listOf(
    Page(
        title = "Lorem ipsum is simply dummy",
        description = "This is a description tab which is made for testing purposes",
        image = R.drawable.onboarding1
    ),
    Page(
        title = "Lorem ipsum is simply dummy2",
        description = "This is a description tab which is made for testing purposes",
        image = R.drawable.onboarding2
    ),
    Page(
        title = "Lorem ipsum is simply dummy3",
        description = "This is a description tab which is made for testing purposes",
        image = R.drawable.onboarding3
    ),
)
