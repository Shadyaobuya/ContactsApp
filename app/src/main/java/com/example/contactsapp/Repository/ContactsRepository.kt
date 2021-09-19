package com.example.contactsapp.Repository

import androidx.lifecycle.LiveData
import com.example.contactsapp.Models.Contacts
import com.example.contactsapp.UI.ContactsApp
import com.example.contactsapp.Database.ContactsDb
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ContactsRepository {
    val database = ContactsDb.getDatabase(ContactsApp.appContext)
    suspend fun saveContact(contact: Contacts) {
        withContext(Dispatchers.IO) {
            database.contactDao().insertContact(contact)
        }
    }
    fun fetchContacts(): LiveData<List<Contacts>>{
        return database.contactDao().getAllContacts()
    }

    fun getContactById(contactId: Int): LiveData<Contacts> {
        return database.contactDao().getContactById(contactId)
    }
}


