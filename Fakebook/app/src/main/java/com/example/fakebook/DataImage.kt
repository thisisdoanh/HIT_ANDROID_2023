package com.example.fakebook

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class DataImage(
    val img : Int,
) : Parcelable
