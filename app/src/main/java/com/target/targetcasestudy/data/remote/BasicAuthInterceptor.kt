package com.target.targetcasestudy.data.remote

import okhttp3.Interceptor
import okhttp3.Response

class BasicAuthInterceptor  : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        var request = chain.request()
        request = request.newBuilder().build()
        return chain.proceed(request)
    }
}