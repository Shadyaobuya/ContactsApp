package com.example.contactsapp.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.contactsapp.R
import com.squareup.picasso.Picasso

class ViewContactActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_contact)
        var intent=intent
        var image= intent.getStringExtra("image").toString()
        var name=intent.getStringExtra("name")
        var number=intent.getStringExtra("number")
        var email=intent.getStringExtra("email")


        var tvname=findViewById<TextView>(R.id.tvgetName)
        var tvnumber=findViewById<TextView>(R.id.tvgetNumber)
        var tvmail=findViewById<TextView>(R.id.tvgetmail)
        var ivimage=findViewById<ImageView>(R.id.ivgetimage)
        tvname.text=name
        tvnumber.text=number
        tvmail.text=email
        Picasso.get().load(image).into(ivimage)


}}



