package com.example.toast_and_context

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.toast_and_context.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setContentView(binding.root)
        binding.button.setOnClickListener {
            Toast.makeText(applicationContext,"Hi I am a DAYAM",Toast.LENGTH_LONG).show()
        }

    }
}