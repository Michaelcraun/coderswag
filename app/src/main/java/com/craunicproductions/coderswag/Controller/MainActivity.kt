package com.craunicproductions.coderswag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.craunicproductions.coderswag.Adapters.CategoryAdapater
import com.craunicproductions.coderswag.Adapters.CategoryRecycleAdapter
import com.craunicproductions.coderswag.Model.Category
import com.craunicproductions.coderswag.R
import com.craunicproductions.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var adapter: CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecycleAdapter(this, DataService.categories) { category ->

        }
        listView.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        listView.layoutManager = layoutManager
        listView.setHasFixedSize(true)


    }
}
