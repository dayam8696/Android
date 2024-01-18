package com.example.bottom_navigation.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.bottom_navigation.databinding.HomeFragmentBinding
import com.example.bottom_navigation.databinding.MenuFragmentBinding

class MenuFragment:Fragment() {
    private val binding by lazy { MenuFragmentBinding.inflate(layoutInflater) }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }
}