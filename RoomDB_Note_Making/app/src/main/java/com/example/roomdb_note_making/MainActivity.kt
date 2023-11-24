package com.example.roomdb_note_making

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.roomdb_note_making.databinding.ActivityMainBinding
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch


class MainActivity : AppCompatActivity(), INotesRVAdapter {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    lateinit var viewModel: NoteViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setContentView(binding.root)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = NotesRVAdapter(this,this)
        binding.recyclerView.adapter = adapter

        viewModel = ViewModelProvider(this).get(NoteViewModel::class.java )
        viewModel.allNotes.observe(this , Observer {list->
          list?.let {
              adapter.updateList(it)
          }

        })

    }

    override fun onItemClicked(note: Note) {
            fun deleteNote(note :Note) = vi
}