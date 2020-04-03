package com.craunicproductions.coderswag.Services

import com.craunicproductions.coderswag.Model.Category
import com.craunicproductions.coderswag.Model.Product

object DataService {
    val categories = listOf(
        Category("shirts", "shirtimage"),
        Category("hoodies", "hoodieimage"),
        Category("hats", "hatimage"),
        Category("digital", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("Devslopes Graphic Beanie", "$18", "hat1"),
        Product("Devslopes Graphic Ball Cap (Black)", "$20", "hat2"),
        Product("Devslopes Graphic Ball Cap (White)", "$20", "hat3"),
        Product("Devslopes Snapback", "$23", "hat4")
    )

    val hoodies = listOf(
        Product("Devslopes Hoodie (Gray)", "$28", "hoodie1"),
        Product("Devslopes Hoodie (Red)", "$32", "hoodie2"),
        Product("Devslopes Hoodie (Gray)", "$29", "hoodie3"),
        Product("Devslopes Hoodie (Black)", "$31", "hoodie4"),
    )

    val shirts = listOf(
        Product("Devslopes Shirt (Black)", "$18", "shirt1"),
        Product("Devslopes Shirt (Light Gray)", "$20", "shirt2"),
        Product("Devslopes Shirt (Red)", "$21", "shirt3"),
        Product("Devslopes Hustle Shirt", "$19", "shirt4"),
        Product("Kickflip Studios", "$18", "shirt5")
    )
}