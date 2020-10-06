package com.example.madlevel1task1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.madlevel1task1.databinding.ActivityHigherLowerBinding

class HigherLowerActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHigherLowerBinding
    private var currentThrow: Int = 1
    private var lastThrow: Int = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHigherLowerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initViews()
    }

    fun initViews() {
        updateUI()
    }

    fun updateUI() {
        // 1. Access view through binding.
        // 2. Set its text property to the string from res>strings.xml
        // (R stands for the resource folder)
        binding.lastThrowValue.text = getString(R.string.last_throw, lastThrow)
    }

    fun rollDice() {
        lastThrow = currentThrow
        // Picks random number from set 1 to 6.
        currentThrow = (1..6).random()
        updateUI()
    }
}