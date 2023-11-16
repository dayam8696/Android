package com.example.passing_data_between_intent

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.passing_data_between_intent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    companion object {
        lateinit var person: Person
    }

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val name = binding.etName.text.toString()
            val age = binding.etAge.text.toString().trim().toInt()
            val country = binding.etCountry.text.toString()
            person = Person(name, age, country)

            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}
