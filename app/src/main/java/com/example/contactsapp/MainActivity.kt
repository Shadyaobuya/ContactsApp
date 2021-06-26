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
            Contacts("Shadya Obuya", "0729113940", "shadyaobuyagard@gmail.com","https://i0.wp.com/post.healthline.com/wp-content/uploads/2020/05/yawning_overtired_baby-1296x728-header.jpg?w=1155&h=1528"),
            Contacts("Sarah Sindet", "075643900", "sarahsindeti@gmail.com","https://i.pinimg.com/originals/b5/5f/b8/b55fb8392ea066c0393b56262a1f88d2.jpg"),
            Contacts("Belyse Intwaza", "07865432", "belyseiintwaza@gmail.com","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTy5Dx_c7NrxzHR5f2zmvh42C70CvILJ4iG9kIDE0r-oIM2HxFBujnhjYrHCkCsbQME_rA&usqp=CAU\n"),
            Contacts("Gingam Achuchu", "0778405062", "gingam@gmail.com","https://i.guim.co.uk/img/media/665a4973d2088276bc500afe7a677fab7add82e1/0_0_3600_2160/master/3600.jpg?width=1200&height=900&quality=85&auto=format&fit=crop&s=bbd13d40180501afe8e197a79b716823\n"),
            Contacts("Juliet Gisemba", "07887652", "gisembajuliet@gmail.com","https://sm.ign.com/ign_ap/news/t/the-boondo/the-boondocks-is-getting-a-tv-reboot-with-aaron-mcgruder_uw4c.jpg"),
            Contacts("Rhun Nasra", "07887652", "nasraakulloh@gmail.com","https://cdn3.toonboom.com/wp-content/uploads/2020/09/15152049/the-proud-family-disney-plus-revival.jpg"),
            Contacts("Shamim Kitesi", "0111234552", "gisembajuliet@gmail.com","https://sm.ign.com/ign_ap/news/t/the-boondo/the-boondocks-is-getting-a-tv-reboot-with-aaron-mcgruder_uw4c.jpg"),
            Contacts("Audrey Muvinya", "077865452", "ausdrey@gmail.com","https://cdn3.toonboom.com/wp-content/uploads/2020/09/15152049/the-proud-family-disney-plus-revival.jpg")

        )
        var contactAdapter=ContactsAdapter(contact_list,baseContext)
        rvContacts.layoutManager=LinearLayoutManager(baseContext)
        rvContacts.adapter=contactAdapter
    }
}