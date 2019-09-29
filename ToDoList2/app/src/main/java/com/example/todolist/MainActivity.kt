package com.example.todolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.view.*
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    var fruitArray = arrayListOf<String>("apple","banana","mango","pear","blueberry")
    var titleArray = arrayListOf<String>()
    //var descripArray = arrayListOf<String>("fruit1","fruit2","fruit3","fruit4","fruit5")
    var descripArray = arrayListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.button)
        val edit = findViewById<EditText>(R.id.edit)
        val show = findViewById<TextView>(R.id.show)

        //
        val editd = findViewById<EditText>(R.id.editd)
        val showd = findViewById<EditText>(R.id.showd)

        // set onclick listener

        btn.setOnClickListener {

    }
        var listView: ListView? = null
        listView = findViewById<ListView>(R.id.mobile_list)

//        var textView: TextView? = null
//        textView = findViewById<TextView>(R.id.show)
//        val customAdapter = CustomAdapter(this, show,showd)
//        listView.setAdapter(customAdapter)
    }
}

