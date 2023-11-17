package com.example.radio_button_check_box

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import com.example.radio_button_check_box.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val radiobutton = binding.igmeat.checkedRadioButtonId
            val meat = findViewById<RadioButton>(radiobutton)
            val cheese = binding.cbchees.isChecked
            val onion = binding.cbonion.isChecked
            val slalad = binding.cbsalad.isChecked
            val orderString = "You ordered a burger with\n" +
                    "${meat.text}" +
                    (if (cheese)"\nCheese" else " ") +
                    (if (onion)"\nOnion" else " ") +
                    (if (slalad)"\nSalad" else " ")
            binding.text.text =orderString
        }


    }
}