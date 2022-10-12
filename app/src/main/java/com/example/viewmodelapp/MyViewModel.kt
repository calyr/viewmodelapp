package com.example.viewmodelapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel: ViewModel() {
    private val _myLiveData = MutableLiveData<String>("")
    val myLiveData: LiveData<String> = _myLiveData
    init {
        _myLiveData.value = "My new value"
    }


}