package com.craunicproductions.coderswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.craunicproductions.coderswag.Model.Product
import com.craunicproductions.coderswag.R

class ProductsAdapter(val context: Context, val products: List<Product>) : RecyclerView.Adapter<ProductsAdapter.Holder>() {
    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image = itemView.findViewById<ImageView>(R.id.productImage)
        val name = itemView.findViewById<TextView>(R.id.productName)
        val price = itemView.findViewById<TextView>(R.id.productPrice)

        fun bindProduct(product: Product, context: Context) {
            val resourceID = context.resources.getIdentifier(product.image, "drawable", context.packageName)
            image.setImageResource(resourceID)
            name.text = product.title
            price.text = product.price
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.product_list_item, parent, false)
        return Holder(view)
    }

    override fun getItemCount(): Int {
        return products.count()
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bindProduct(products[position], context)
    }
}
