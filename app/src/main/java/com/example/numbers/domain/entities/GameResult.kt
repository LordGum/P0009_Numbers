package com.example.numbers.domain.entities

data class GameResult (
    val isWinner: Boolean,
    val countOfRightAnswers: Int,
    val countOfQuestions: Int,
    val gameSettings: GameSettings
)