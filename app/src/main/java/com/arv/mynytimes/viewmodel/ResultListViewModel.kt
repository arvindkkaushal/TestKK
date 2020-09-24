package com.arv.mynytimes.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.arv.mynytimes.model.Result

class ResultListViewModel : ViewModel() {

    val resultList=MutableLiveData<List<Result>>()
}