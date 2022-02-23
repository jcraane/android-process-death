package com.example.processdeath

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

class MyViewModel(state: SavedStateHandle) : ViewModel() {
    // getLiveData of the SavedStateHandle is used to obtain a LiveData for the data under the given key. An initial value
    // of 100 is provided
    val data = state.getLiveData("state", "100")

    fun updateState(number: String) {
//        setting the value on the LiveData returned from getLiveData updates the data in the SavedStateHandle
        data.value = number
    }
}