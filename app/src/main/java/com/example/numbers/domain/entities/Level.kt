package com.example.numbers.domain.entities

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
enum class Level: Parcelable {
    TEST, EASY, NORMAL, HARD
}
