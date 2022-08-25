package com.fangxiaoyun.navigationdemo

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

class MainViewModel(private val savedStateHandle: SavedStateHandle) : ViewModel() {

    var currentNavGraph by savedStateHandle.mutableStateOf(R.navigation.navigation_main)
        private set

    private val _onChangeNavGraph = MutableLiveData<Event<Int>>()
    val onChangeNavGraph: MutableLiveData<Event<Int>> = _onChangeNavGraph

    fun handleNewGraph(navGraphId: Int) {
        _onChangeNavGraph.value = Event(navGraphId)
        currentNavGraph = navGraphId
    }
}