package com.example.contactsapp

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.squareup.picasso.Transformation

class ContactsAdapter(var contactsList:List<Contacts>, var context: Context):RecyclerView.Adapter<ContactsViewHolder> (){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
        var item=LayoutInflater.from(parent.context).inflate(R.layout.contacts_layout_item,parent,false)
        return ContactsViewHolder(item)
    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        var currentContact=contactsList.get(position)
        holder.tvname.text=currentContact.contactname
        holder.tvphone.text=currentContact.phoneNumber
        holder.email.text=currentContact.email
        Picasso.get().load(currentContact.imageUrl).placeholder(R.drawable.placeholder).into(holder.imgContacts)  //.placeholder(R.layout.drawable)
        holder.cdContacts.setOnClickListener {
            var intent=Intent(context,ViewContactActivity::class.java)
            intent.putExtra("name",currentContact.contactname)
            intent.putExtra("number",currentContact.phoneNumber)
            intent.putExtra("email",currentContact.email)
            intent.putExtra("image",currentContact.imageUrl)
            context.startActivity(intent)

        }

    }

    override fun getItemCount(): Int {
        return contactsList.size
    }

}

class ContactsViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    var tvname=itemView.findViewById<TextView>(R.id.tvName)
    var tvphone=itemView.findViewById<TextView>(R.id.tvNumber)
    var email=itemView.findViewById<TextView>(R.id.tvemail)
    var imgContacts=itemView.findViewById<ImageView>(R.id.imageView)
    var cdContacts=itemView.findViewById<CardView>(R.id.clContacts)

}
