package com.target.targetcasestudy.domain.use_cases

import com.target.targetcasestudy.common.Resource
import com.target.targetcasestudy.data.remote.dto.DealsResponse
import com.target.targetcasestudy.domain.DealsRepository
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetDealsUseCase @Inject constructor(
    private val repository: DealsRepository
) {
    // remove hard coded strings, design better error handling
    operator fun invoke(): kotlinx.coroutines.flow.Flow<Resource<DealsResponse>> =
        flow {
            try {
                emit(Resource.Loading())
                val getDealsResponse = repository.getDeals()
                emit(Resource.Success(getDealsResponse))
            } catch (e: HttpException) {
                emit(Resource.Error(e.localizedMessage ?: "An unexpected error occurred"))
            } catch (e: IOException) {
                emit(Resource.Error("Couldn't reach server, check your internet connection."))
            }
        }
}