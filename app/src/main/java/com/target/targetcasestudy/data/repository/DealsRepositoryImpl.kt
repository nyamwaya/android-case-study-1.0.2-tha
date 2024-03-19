package com.target.targetcasestudy.data.repository

import com.target.targetcasestudy.data.remote.TargetApi
import com.target.targetcasestudy.data.remote.dto.DealsResponse
import com.target.targetcasestudy.data.remote.dto.Product
import com.target.targetcasestudy.domain.DealsRepository
import javax.inject.Inject

class DealsRepositoryImpl @Inject constructor(
    private val api: TargetApi
) : DealsRepository {
    override suspend fun getDeals(): DealsResponse {
        return api.getDeals()
    }

    override suspend fun getDeals(id: String): Product {
        return api.getSingleDeal(id)
    }
}