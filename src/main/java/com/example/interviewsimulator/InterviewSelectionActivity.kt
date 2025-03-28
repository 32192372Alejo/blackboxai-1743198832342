package com.example.interviewsimulator

import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat

class InterviewSelectionActivity : AppCompatActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_interview_selection)
        
        setupViews()
        setupListeners()
    }
    
    private fun setupViews() {
        // Set status bar color
        window.statusBarColor = ContextCompat.getColor(this, R.color.dark_background)
    }
    
    private fun setupListeners() {
        // Back button click
        findViewById<ImageButton>(R.id.btnBack).setOnClickListener {
            finish()
        }
        
        // Interview type selections
        findViewById<CardView>(R.id.cvTechnical).setOnClickListener {
            handleInterviewTypeSelection("TECHNICAL")
        }
        
        // Start simulation button
        findViewById<Button>(R.id.btnStartSimulation).setOnClickListener {
            val selectedDifficulty = when (findViewById<RadioGroup>(R.id.rgDifficulty).checkedRadioButtonId) {
                R.id.rbEasy -> "EASY"
                R.id.rbNormal -> "NORMAL"
                R.id.rbHard -> "HARD"
                else -> "NORMAL"
            }
            
            startInterview(selectedDifficulty)
        }
        
        // FAQ click
        findViewById<TextView>(R.id.tvFAQ).setOnClickListener {
            showFAQ()
        }
    }

    private fun handleInterviewTypeSelection(type: String) {
        // TODO: Handle interview type selection
        // You can store the selected type in a variable or
        // immediately navigate to the next screen
    }

    private fun startInterview(difficulty: String) {
        // TODO: Start the interview simulation
        // Create an intent to start the interview activity
        // Pass the selected type and difficulty as extras
    }

    private fun showFAQ() {
        // TODO: Show FAQ screen
        // Navigate to FAQ activity or show a dialog
    }
}