package com.target.targetcasestudy.data.remote

import com.target.targetcasestudy.data.remote.dto.DealsResponse
import com.target.targetcasestudy.data.remote.dto.Product
import retrofit2.http.GET
import retrofit2.http.Path

interface TargetApi {

    @GET("deals") suspend fun getDeals() : DealsResponse

    @GET("deals/{id}")
    suspend fun getSingleDeal(
        @Path("id") id: String
    ) : Product

}