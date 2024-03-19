package com.target.targetcasestudy.data.remote.dto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import com.target.targetcasestudy.api.Price

@JsonClass(generateAdapter = true)
data class Product (
    @Json(name = "id")
    val dealId: Int,
    val title: String,
    val aisle: String,
    val description: String,
    val image_url: String,
    val regular_price: Price,
    val sale_price: Price,
    val fulfillment: String,
    val availability: String,
)