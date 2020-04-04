package com.craunicproductions.coderswag.Controller

import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.craunicproductions.coderswag.Adapters.ProductsAdapter
import com.craunicproductions.coderswag.Model.Category
import com.craunicproductions.coderswag.R
import com.craunicproductions.coderswag.Services.DataService
import com.craunicproductions.coderswag.Utilities.Constants
import kotlinx.android.synthetic.main.activity_products.*

class ProductsActivity : AppCompatActivity() {
    private lateinit var adapter: ProductsAdapter
    private lateinit var category: Category

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        category = intent.getParcelableExtra(Constants.category.key)!!
        adapter = ProductsAdapter(this, DataService.getProducts(category)) { product ->
            println("product: ${ product.title }")
            val intent = Intent(this, ProductActivity::class.java)
            intent.putExtra(Constants.product.key, product)
            startActivity(intent)
        }

        val orientation = resources.configuration.orientation
        val screenSize = resources.configuration.screenWidthDp
        var spanCount = 2
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            spanCount = 3
        }

        if (screenSize > 720) {
            spanCount = 3
        }


        val layoutManager = GridLayoutManager(this, spanCount)
        listView.adapter = adapter
        listView.layoutManager = layoutManager
    }
}
