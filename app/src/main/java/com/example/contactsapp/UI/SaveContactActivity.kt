package com.example.contactsapp.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.contactsapp.Models.Contacts
import com.example.contactsapp.databinding.ActivitySaveContactBinding

class SaveContactActivity : AppCompatActivity() {
    lateinit var binding: ActivitySaveContactBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivitySaveContactBinding.inflate(layoutInflater)

        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        binding.btContact.setOnClickListener {
            saveContacts()

        }
    }
        fun saveContacts(){
            var name=binding.etname.text.toString()
            var email=binding.etemail.text.toString()
            var number=binding.etNumber.text.toString()
            var error=false
            if (name.isEmpty()){
                binding.etname.error="Cant be blank"
                }
            else if(email.isEmpty()){
                binding.etemail.error="Cant be blank"
            }
            else if(number.isEmpty() ){
                binding.etNumber.error="Cant be blank"
            }
            if (!error){
                var contact= Contacts(0,name,email,number," ")
            }
        }

}

//package com.example.contactspage.ui
//
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import androidx.activity.viewModels
//import com.example.contactspage.ContactsViewModel.ContactsViewModel
//import com.example.contactspage.databinding.ActivityAddContactBinding
//import com.example.contactspage.model.Contacts
//
//class AddContactActivity : AppCompatActivity() {
//    lateinit var binding: ActivityAddContactBinding
//    val contactsViewModel: ContactsViewModel by viewModels()
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        binding = ActivityAddContactBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//    }
//
//    override fun onResume() {
//        super.onResume()
//        binding.btnAddContact.setOnClickListener {
//            saveContact()
//        }
//    }
//    fun saveContact(){
//        var name = binding.etName.text.toString()
//        var email = binding.etEmail.text.toString()
//        var phoneNumber = binding.etPhoneNumber.text.toString()
//
//        var error = false
//        if (name.isEmpty() || name.isBlank()){
//            error = true
//            binding.tilName.error = "Name is required"
//        }
//
//        if (email.isEmpty() || name.isBlank()){
//            error = true
//            binding.tilEmail.error = "Email is required"
//        }
//
//        if (phoneNumber.isEmpty() || name.isBlank()){
//            error = true
//            binding.tilPhoneNumber.error = "Phone Number is required"
//        }
//
//        if (!error){
//            var contact = Contacts(0, name, email, phoneNumber, "")
//            contactsViewModel.saveContact(contact)
//            binding.etName.setText("")
//            binding.etEmail.setText("")
//            binding.etPhoneNumber.setText("")
//        }
//    }
//}
