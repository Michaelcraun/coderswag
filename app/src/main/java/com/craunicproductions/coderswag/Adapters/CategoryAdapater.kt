package com.craunicproductions.coderswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.craunicproductions.coderswag.Model.Category
import com.craunicproductions.coderswag.R
import org.w3c.dom.Text

class CategoryAdapater(val context: Context, val categories: List<Category>) : BaseAdapter() {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View
        view = LayoutInflater.from(context).inflate(R.layout.category_list_item, null)
        val image: ImageView = view.findViewById(R.id.categoryImage)
        val name: TextView = view.findViewById(R.id.categoryName)
        val category = categories[position]

        val resourceID = context.resources.getIdentifier(category.image, "drawable", context.packageName)
        name.text = category.title
        image.setImageResource(resourceID)

        return view
    }

    override fun getItem(position: Int): Any {
        return categories[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return categories.count()
    }
}