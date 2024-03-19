package com.target.targetcasestudy.data.remote.dto

import com.target.targetcasestudy.api.Price

data class Product (
    val id: Int,
    val title: String,
    val aisle: String,
    val description: String,
    val image_url: String,
    val regular_price: Price,
    val sale_price: Price,
    val fulfillment: String,
    val availability: String,
)