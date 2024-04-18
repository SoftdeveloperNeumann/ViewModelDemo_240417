package com.example.viewmodeldemo

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Data : ViewModel(){
    val content = MutableLiveData<String>()
}