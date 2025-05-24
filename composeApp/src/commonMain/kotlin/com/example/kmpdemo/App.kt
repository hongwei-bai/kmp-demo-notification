package com.example.kmpdemo

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.kmpdemo.domain.SomeUseCase
import com.example.kmpdemo.nav.NavViewModel
import com.example.kmpdemo.nav.Screen
import com.example.kmpdemo.nav.tabScreens
import com.example.kmpdemo.ui.DetailsScreen
import com.example.kmpdemo.ui.HomeScreen
import com.example.kmpdemo.ui.SettingsScreen
import com.example.kmpdemo.ui.theme.MyAppTheme
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.mp.KoinPlatform.getKoin

@Composable
@Preview
fun App(useCase: SomeUseCase) {
    val navViewModel: NavViewModel = getKoin().get()
    val currentScreen by navViewModel.currentScreen.collectAsState()
    val selectedTabIndex by navViewModel.selectedTabIndex.collectAsState()
    val isDesktop = getPlatform().name.startsWith("Java")

    MyAppTheme {
        Scaffold(
            bottomBar = {
                if (!isDesktop) {
                    BottomNavigation {
                        BottomNavigationItem(
                            selected = currentScreen is Screen.Home,
                            onClick = { navViewModel.navigate(Screen.Home) },
                            label = { Text("Home") },
                            icon = { Icon(Icons.Default.Home, contentDescription = null) }
                        )
                        BottomNavigationItem(
                            selected = currentScreen is Screen.Settings,
                            onClick = { navViewModel.navigate(Screen.Settings) },
                            label = { Text("Settings") },
                            icon = { Icon(Icons.Default.Settings, contentDescription = null) }
                        )
                    }
                }
            }
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(WindowInsets.statusBars.asPaddingValues())
            ) {
                if (isDesktop) {
                    TabRow(selectedTabIndex = selectedTabIndex) {
                        tabScreens.forEachIndexed { index, screen ->
                            Tab(
                                text = { Text(screen.title) },
                                selected = selectedTabIndex == index,
                                onClick = { navViewModel.selectTab(index) }
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(16.dp))
                }

                ScreensContent(currentScreen, navViewModel, useCase)
            }
        }
    }
}

@Composable
private fun ScreensContent(currentScreen: Screen, navViewModel: NavViewModel, useCase: SomeUseCase) {
    when (currentScreen) {
        is Screen.Home -> HomeScreen(useCase = useCase, onNavigateToDetails = {
            navViewModel.navigate(Screen.Details("item-123"))
        })

        is Screen.Settings -> SettingsScreen(onBack = { navViewModel.goBack() })
        is Screen.Details -> DetailsScreen(itemId = currentScreen.itemId, onBack = { navViewModel.goBack() })
    }
}