package com.example.composenewsapp

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.composenewsapp.domain.usecases.AppEntryUseCases
import com.example.composenewsapp.presentation.navgraph.Routes
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val appEntryUseCases: AppEntryUseCases
): ViewModel() {

     var splashCondition by mutableStateOf(true)
         private set

     var startDestination by mutableStateOf(Routes.AppStartNavigation.route)
        private set

//    private var _startDestination = mutableStateOf(Routes.AppStartNavigation.route)
//    private var startDestination: String = _startDestination as String

    init {
        appEntryUseCases.readAppEntry().onEach { shouldStartFromHomeScreen ->
            if (shouldStartFromHomeScreen) {
                startDestination = Routes.NewsNavigation.route
            } else {
                startDestination = Routes.AppStartNavigation.route
            }
            delay(500L)
            splashCondition = false
        }.launchIn(viewModelScope)
    }
}