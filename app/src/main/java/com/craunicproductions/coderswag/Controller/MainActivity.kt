package com.craunicproductions.coderswag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.craunicproductions.coderswag.Adapters.CategoryAdapater
import com.craunicproductions.coderswag.Model.Category
import com.craunicproductions.coderswag.R
import com.craunicproductions.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var adapter: CategoryAdapater

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapater(this, DataService.categories)
        listView.adapter = adapter
    }
}
