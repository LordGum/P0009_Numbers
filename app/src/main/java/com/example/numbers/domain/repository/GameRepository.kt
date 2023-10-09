package com.example.numbers.domain.repository

import com.example.numbers.domain.entities.GameSettings
import com.example.numbers.domain.entities.Level
import com.example.numbers.domain.entities.Question

interface GameRepository {
    fun generateQuestion(maxSumValue: Int, countOfOptions: Int): Question

    fun getGameSettings(level: Level): GameSettings
}