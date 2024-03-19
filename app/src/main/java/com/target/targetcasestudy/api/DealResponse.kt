package com.target.targetcasestudy.api

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import com.target.targetcasestudy.data.remote.dto.Deal

@JsonClass(generateAdapter = true)
data class DealResponse(
  @Json(name = "products")
  val deals: List<Deal>
)
