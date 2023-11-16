package com.example.passing_data_between_intent
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.passing_data_between_intent.databinding.ActivityMainBinding
import com.example.passing_data_between_intent.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private val binding by lazy { ActivitySecondBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

       val person = MainActivity.person
        val name = person.name
        val age = person.age
        val country = person.country
        binding.tvPerson.text = "Name is $name he/she is $age year old from country $country"
    }
}