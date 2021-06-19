package com.example.contactsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        displayContacts()
    }

    fun displayContacts() {
        var rvContacts = findViewById<RecyclerView>(R.id.rvContacts)
        var contact_list = listOf(
            Contacts("Shadya Obuya", "0729113940", "shadyaobuyagard@gmail.com"),
            Contacts("Sarah Sindet", "075643900", "sarahsindeti@gmail.com"),
            Contacts("Belyse Intwaza", "07865432", "belyseiintwaza@gmail.com"),
            Contacts("Juliet Gisemba", "07887652", "gisembajuliet@gmail.com"),
            Contacts("Shadya Obuya", "0729113940", "shadyaobuyagard@gmail.com"),
            Contacts("Sarah Sindet", "075643900", "sarahsindeti@gmail.com"),
            Contacts("Belyse Intwaza", "07865432", "belyseiintwaza@gmail.com"),
            Contacts("Juliet Gisemba", "07887652", "gisembajuliet@gmail.com"),
            Contacts("Shadya Obuya", "0729113940", "shadyaobuyagard@gmail.com"),
            Contacts("Sarah Sindet", "075643900", "sarahsindeti@gmail.com"),
            Contacts("Belyse Intwaza", "07865432", "belyseiintwaza@gmail.com"),
            Contacts("Juliet Gisemba", "07887652", "gisembajuliet@gmail.com"),
        )
        var contactAdapter=ContactsAdapter(contact_list)
        rvContacts.layoutManager=LinearLayoutManager(baseContext)
        rvContacts.adapter=contactAdapter
    }
}