package com.android254.droidconKE2020.about.ui.views

import com.android254.droidconKE2020.about.R

data class Organizer(
    val name: String,
    val imageUrl: Int = R.drawable.franktamre, // TODO Change to String type (image url)
    val title: String
)