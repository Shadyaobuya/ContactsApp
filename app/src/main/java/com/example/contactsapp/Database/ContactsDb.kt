package com.example.contactsapp.Database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.contactsapp.Models.Contacts
import com.example.contactsapp.Models.Note

@Database(entities = arrayOf(Contacts::class,Note::class),version=1)
abstract class ContactsDb:RoomDatabase() {
    abstract fun contactDao(): ContactDao
    abstract fun notesDao():NotesDao

        companion object {
            private var database: ContactsDb? = null
            fun getDatabase(context: Context): ContactsDb {
                if (database == null) {
                    database = Room.databaseBuilder(    //room builder to create a new instance of db
                        context,
                        ContactsDb::class.java, "contactsDb"
                    )
                        .fallbackToDestructiveMigration().build()
                }
                return database as ContactsDb
            }
        }
    }


