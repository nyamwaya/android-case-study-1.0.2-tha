package com.target.targetcasestudy.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.target.targetcasestudy.common.Resource
import com.target.targetcasestudy.data.remote.dto.GetDealsResponse
import com.target.targetcasestudy.domain.use_cases.GetDealsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class DealsScreenViewModel @Inject constructor(
    private val getDealsUseCase: GetDealsUseCase
) : ViewModel() {
    private val _getDealsState =
        MutableStateFlow<Resource<GetDealsResponse>>(Resource.Loading(null))
    val getDealsState: StateFlow<Resource<GetDealsResponse>> = _getDealsState

    fun getDeals() {
        getDealsUseCase().onEach { result ->
            _getDealsState.value = result
        }.launchIn(viewModelScope)
    }
}