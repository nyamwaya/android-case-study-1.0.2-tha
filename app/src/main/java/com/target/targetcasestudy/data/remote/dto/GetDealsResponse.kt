package com.target.targetcasestudy.data.remote.dto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class GetDealsResponse(
    @Json(name = "products")
    val deals: List<Product>
)