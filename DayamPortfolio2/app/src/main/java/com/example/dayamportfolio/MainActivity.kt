package com.example.dayamportfolio

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonSkills = findViewById<Button>(R.id.btnskills)
        buttonSkills.setOnClickListener {
            intent = Intent(this, SkillsActivity::class.java)
            startActivity(intent)
        }
        val buttonEducation = findViewById<Button>(R.id.btneducation)
        buttonEducation.setOnClickListener {
            intent = Intent(this, EducationActivity::class.java)
            startActivity(intent)
        }
        val work = findViewById<Button>(R.id.work)
        work.setOnClickListener {
            val workFragment = workFragment()
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, workFragment)
                .addToBackStack(null)
                .commit()
        }
    }



}