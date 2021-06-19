package com.example.contactsapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactsAdapter(var contactsList:List<Contacts>):RecyclerView.Adapter<ContactsViewHolder> (){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
        var item=LayoutInflater.from(parent.context).inflate(R.layout.contacts_layout_item,parent,false)
        return ContactsViewHolder(item)
    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        var currentContact=contactsList.get(position)
        holder.tvname.text=currentContact.contactname
        holder.tvphone.text=currentContact.phoneNumber
        holder.email.text=currentContact.email

    }

    override fun getItemCount(): Int {
        return contactsList.size
    }

}

class ContactsViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    var tvname=itemView.findViewById<TextView>(R.id.tvName)
    var tvphone=itemView.findViewById<TextView>(R.id.tvNumber)
    var email=itemView.findViewById<TextView>(R.id.tvemail)

}
