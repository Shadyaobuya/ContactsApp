package com.example.contactsapp.UI

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.contactsapp.ContactsAdapter
import com.example.contactsapp.Models.Contacts
import com.example.contactsapp.ViewModel.ContactsViewModel
import com.example.contactsapp.databinding.ActivityMainBinding
import com.example.contactsapp.databinding.ActivitySaveContactBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    val contactsViewModel: ContactsViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    override fun onResume() {
        super.onResume()
        contactsViewModel.fetchContacts()
        contactsViewModel.contactLiveData.observe(this, {contacts->
            displayContacts(contacts)
        })

        binding.btsave.setOnClickListener {
            startActivity(Intent(this, SaveContactActivity::class.java))
        }
}

    fun displayContacts(contactList:List<Contacts>) {
        var rvContacts = binding.rvContacts
        var contact_list = listOf(contactList)
        var contactAdapter=ContactsAdapter(contactList,baseContext)
        rvContacts.layoutManager=LinearLayoutManager(baseContext)
        rvContacts.adapter=contactAdapter
    }
}

