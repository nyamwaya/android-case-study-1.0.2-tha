package com.target.targetcasestudy.domain

import com.target.targetcasestudy.data.remote.dto.GetDealsResponse
import com.target.targetcasestudy.data.remote.dto.Product

interface DealsRepository {
    suspend fun getDeals() : GetDealsResponse
    suspend fun getDeals(id: String) : Product
}