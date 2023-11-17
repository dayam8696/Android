package com.example.tasbicoubt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tasbicoubt.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setContentView(binding.root)

        var count = 0
        binding.button.setOnClickListener {
            count++
            binding.textView.text = "COUNT: $count"
        }
            var m =0
        binding.button2.setOnClickListener {
            binding.textView.text="COUNT: $m"
        }
    }
}