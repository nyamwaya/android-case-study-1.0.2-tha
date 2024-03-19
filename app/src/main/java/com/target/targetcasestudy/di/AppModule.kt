package com.target.targetcasestudy.di

import com.target.targetcasestudy.common.Constants
import com.target.targetcasestudy.data.remote.TargetApi
import com.target.targetcasestudy.data.repository.DealsRepositoryImpl
import com.target.targetcasestudy.domain.DealsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    private val dealsInterceptor = HttpLoggingInterceptor()
        .setLevel(HttpLoggingInterceptor.Level.BODY)

    private val client = OkHttpClient.Builder()
        .addInterceptor(dealsInterceptor)
        .build()

    @Provides
    @Singleton
    fun provideTargetApi(): TargetApi {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_PRODUCTION_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(client)
            .build()
            .create(TargetApi::class.java)
    }

    @Provides
    @Singleton
    fun provideDealsRepository(api: TargetApi): DealsRepository {
        return DealsRepositoryImpl(api)
    }
}