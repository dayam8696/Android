package com.example.bottom_navigation.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.bottom_navigation.R
import com.example.bottom_navigation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val bottomNav = binding.bottomNav
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.NavHost) as NavHostFragment
        val navController = navHostFragment.navController
        bottomNav.setupWithNavController(navController)

    }
}