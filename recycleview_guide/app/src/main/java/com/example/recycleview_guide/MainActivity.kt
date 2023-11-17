package com.example.recycleview_guide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recycleview_guide.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setContentView(binding.root)

        val songsObject = mutableListOf<song>()
        songsObject.add(song("Hello" ,"Just the discription"))
        songsObject.add(song("how are you" ,"Just the discription"))
        songsObject.add(song("Hello" ,"Just the discription"))
        songsObject.add(song("Hello" ,"Just the discription"))
        songsObject.add(song("Hello" ,"Just the discription"))
        songsObject.add(song("Hello" ,"Just the discription"))
        songsObject.add(song("Hello" ,"Just the discription"))
        songsObject.add(song("Hello" ,"Just the discription"))
        songsObject.add(song("Hello" ,"Just the discription"))
        songsObject.add(song("Hello" ,"Just the discription"))
        songsObject.add(song("Hello" ,"Just the discription"))
        songsObject.add(song("Hello" ,"Just the discription"))
        songsObject.add(song("Hello" ,"Just the discription"))
        songsObject.add(song("Hello" ,"Just the discription"))
        binding.songlist.adapter = MyAdapter(songsObject)
        binding.songlist.layoutManager = LinearLayoutManager(this)

    }
}