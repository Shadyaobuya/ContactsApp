package com.example.contactsapp.Repository

import androidx.lifecycle.LiveData
import com.example.contactsapp.UI.ContactsApp
import com.example.contactsapp.Database.ContactsDb
import com.example.contactsapp.Models.Note
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class NotesRepository {
    val database = ContactsDb.getDatabase(ContactsApp.appContext)

    suspend fun saveNote(note: Note) {
        withContext(Dispatchers.IO) {
            database.notesDao().insertNote(note)
        }
    }
    fun getAllNotes(): LiveData<List<Note>> {
        return database.notesDao().getAllNotes()

    }
    fun getNotesById(noteId: Int): LiveData<Note> {
        return database.notesDao().getNoteById(noteId)
    }

}