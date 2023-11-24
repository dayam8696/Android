package com.example.roomdb_note_making

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData

class NoteViewModel(application: Application) : AndroidViewModel(application) {
    val allNotes : LiveData<List<Note>>
    init {
        val dao = Notedatabase.getDatabase(application).NoteDao()
        val repository = NoteRepository(dao)
        allNotes = repository.allNotes
    }
}