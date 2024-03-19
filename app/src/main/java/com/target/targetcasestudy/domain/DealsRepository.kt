package com.target.targetcasestudy.domain

import com.target.targetcasestudy.data.remote.dto.DealsResponse
import com.target.targetcasestudy.data.remote.dto.Product

interface DealsRepository {
    suspend fun getDeals() : DealsResponse
    suspend fun getDeals(id: String) : Product
}