package com.example.todolist

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class CustomAdapter(private var context: Context, private var title_list: ArrayList<String>, private var des_list: ArrayList<String>) :BaseAdapter(){

    private val inflater: LayoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val rowView: View
        rowView = inflater.inflate(R.layout.activity_listview,null)

        val item_title= rowView.findViewById(R.id.itemTitle) as TextView

        val item_description = rowView.findViewById(R.id.itemDescription) as TextView

        item_title.text = title_list[position]
        item_description.text = des_list[position]

        return  rowView
    }

    override fun getItem(position: Int): Any {
        return title_list[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return title_list.size
    }
}