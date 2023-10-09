package com.example.numbers.domain.entities

data class Question (
    val sum: Int,
    val visibleNum: Int,
    val options: List<Int>
)