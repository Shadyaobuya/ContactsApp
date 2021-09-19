package com.example.contactsapp.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.contactsapp.Models.Note
import com.example.contactsapp.Repository.ContactsRepository
import com.example.contactsapp.Repository.NotesRepository
import kotlinx.coroutines.launch

class NotesViewModel:ViewModel() {
    var notesRepository = NotesRepository()
    lateinit var notesLiveData: LiveData<List<Note>>
//    fun getNotesById(notes: Int) {
//        notesLiveData = notesRepository.getNotesById()
//    }

    fun saveNote(note: Note) {
        viewModelScope.launch {
            notesRepository.saveNote(note)
        }
    }

    fun fetchNotes() {
        notesLiveData = notesRepository.getAllNotes()
    }
}