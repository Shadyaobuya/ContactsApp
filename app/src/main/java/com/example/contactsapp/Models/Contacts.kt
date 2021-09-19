package com.example.contactsapp.Models

import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Contacts")
data class Contacts(
    @PrimaryKey(autoGenerate = true) @NonNull var id:Int,
    var contactname:String,
    var phoneNumber:String,
    var email:String,
    var imageUrl:String //holds image url /links of imges we will display on our app

)
