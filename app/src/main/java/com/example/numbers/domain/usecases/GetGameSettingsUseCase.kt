package com.example.numbers.domain.usecases

import com.example.numbers.domain.entities.GameSettings
import com.example.numbers.domain.entities.Level
import com.example.numbers.domain.repository.GameRepository

class GetGameSettingsUseCase(private val repository: GameRepository) {
    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }
}