package com.example.contactsapp.Database

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.contactsapp.Models.Contacts

@Dao
interface ContactDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertContact(contact: Contacts)
    @Query("SELECT * FROM Contacts")
    fun getAllContacts(): LiveData<List<Contacts>>
    @Query("SELECT * FROM Contacts WHERE id = :contactId")
    fun getContactById(contactId: Int): LiveData<Contacts>
    @Delete
    fun deleteContact(contact: Contacts)
}