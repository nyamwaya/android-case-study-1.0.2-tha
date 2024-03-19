package com.target.targetcasestudy.data.repository

import com.target.targetcasestudy.data.remote.TargetApi
import com.target.targetcasestudy.domain.DealsRepository
import javax.inject.Inject

class DealsRepositoryImpl @Inject constructor(
    private val api: TargetApi
) : DealsRepository