package com.craunicproductions.coderswag.Controller

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.craunicproductions.coderswag.Model.Product
import com.craunicproductions.coderswag.R
import com.craunicproductions.coderswag.Utilities.Constants
import kotlinx.android.synthetic.main.activity_product.*

class ProductActivity : AppCompatActivity() {
    private lateinit var product: Product

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)

        product = intent.getParcelableExtra(Constants.product.key)!!
        setupProductPage()
    }

    private fun setupProductPage() {
        val resourceID = resources.getIdentifier(product.image, "drawable", packageName)
        imageView.setImageResource(resourceID)
        detailsTextView.text = getString(R.string.description)
        titleLabel.text = product.title
        priceLabel.text = product.price
    }
}
