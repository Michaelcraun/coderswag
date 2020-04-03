package com.craunicproductions.coderswag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.craunicproductions.coderswag.Model.Category
import com.craunicproductions.coderswag.R
import com.craunicproductions.coderswag.Utilities.Constants
import kotlinx.android.synthetic.main.activity_products.*

class ProductsActivity : AppCompatActivity() {
    private lateinit var category: Category

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        category = intent.getParcelableExtra(Constants.category.key)!!
    }
}
