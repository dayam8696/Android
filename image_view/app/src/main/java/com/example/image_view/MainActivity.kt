package com.example.image_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.image_view.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.gdsc)
        }
    }
}