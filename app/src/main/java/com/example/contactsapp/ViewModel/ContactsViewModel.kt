package com.example.contactsapp.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.contactsapp.Models.Contacts
import com.example.contactsapp.Repository.ContactsRepository
import kotlinx.coroutines.launch

class ContactsViewModel:ViewModel() {
    var contactsRepository = ContactsRepository()
    lateinit var contactLiveData: LiveData<List<Contacts>>

    fun fetchContacts(){
        contactLiveData = contactsRepository.fetchContacts()
    }

    fun saveContact(contact: Contacts) {
        viewModelScope.launch {
            contactsRepository.saveContact(contact)
        }
        }

//    fun getContactId(contactId: Int){
//        contactLiveData = ContactsRepository.getContactById(contactId)
//    }
    }

