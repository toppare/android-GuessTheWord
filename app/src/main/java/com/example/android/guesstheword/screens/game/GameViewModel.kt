package com.example.android.guesstheword.screens.game

import androidx.lifecycle.ViewModel
import android.util.Log

class GameViewModel : ViewModel() {
    init {
        Log.i("GameViewModel", "GameViewModel created")
    }

    override fun onCleared() {
        super.onCleared()
        Log.i("GameViewModel", "GameViewModel destroyed")
    }
}
