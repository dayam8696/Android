package com.example.memeworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.bumptech.glide.Glide
import com.example.memeworld.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        setContentView(binding.root)
      //  loadMeme()
    }
private fun loadMeme(){
    // Instantiate the RequestQueue.
    val queue = Volley.newRequestQueue(this)
    val url = "https://meme-api.com/gimme"

// Request a string response from the provided URL.
    val jsonObjectRequest = JsonObjectRequest(
        Request.Method.GET, url,null,
        Response.Listener{ response ->
        val url = response.getString("url")
        Glide.with(this).load(url).into(binding.memeImageView)
        },
        Response.ErrorListener { })

// Add the request to the RequestQueue.
    queue.add(jsonObjectRequest)
}
    fun share(view: View) {}
    fun nextMeme(view: View) {}
}