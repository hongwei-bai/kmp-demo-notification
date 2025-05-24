package com.example.kmpdemo.nav

import com.example.kmpdemo.getPlatform
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class NavViewModel() {
    private val _currentScreen = MutableStateFlow<Screen>(Screen.Colors)
    val currentScreen: StateFlow<Screen> = _currentScreen

    private val _selectedTabIndex = MutableStateFlow(0)
    val selectedTabIndex: StateFlow<Int> = _selectedTabIndex

    init {
        val isDesktop = getPlatform().name.startsWith("Java")
        if (isDesktop) {
            // Keep currentScreen in sync with tab selection
            _selectedTabIndex.collectInBackground { index ->
                _currentScreen.value = tabScreens.getOrNull(index) ?: Screen.Home
            }
        }
    }

    fun navigate(to: Screen) {
        _currentScreen.value = to
    }

    fun goBack() {
        _currentScreen.value = Screen.Home
    }

    fun selectTab(index: Int) {
        _selectedTabIndex.value = index
    }
}

fun <T> StateFlow<T>.collectInBackground(
    scope: CoroutineScope = CoroutineScope(Dispatchers.Default),
    block: (T) -> Unit
) {
    scope.launch {
        collect { block(it) }
    }
}