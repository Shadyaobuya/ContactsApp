package com.example.contactsapp.Database

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.contactsapp.Models.Contacts
import com.example.contactsapp.Models.Note
@Dao
interface NotesDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertNote(notes: Note)
    @Query("SELECT * FROM Notes")
    fun getAllNotes(): LiveData<List<Note>>
    @Query("SELECT * FROM Notes WHERE noteId = :noteId")
    fun getNoteById(noteId: Int): LiveData<Note>
    @Delete
    fun deleteContact(contact: Contacts)
}