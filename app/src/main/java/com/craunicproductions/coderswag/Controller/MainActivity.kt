package com.craunicproductions.coderswag.Controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.craunicproductions.coderswag.Adapters.CategoryRecycleAdapter
import com.craunicproductions.coderswag.R
import com.craunicproductions.coderswag.Services.DataService
import com.craunicproductions.coderswag.Utilities.Constants
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var adapter: CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecycleAdapter(this, DataService.categories) { category ->
            val intent = Intent(this, ProductsActivity::class.java)
            intent.putExtra(Constants.category.key, category)
            startActivity(intent)
        }
        listView.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        listView.layoutManager = layoutManager
        listView.setHasFixedSize(true)
    }
}
