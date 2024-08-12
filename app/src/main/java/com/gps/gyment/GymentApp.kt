package com.gps.gyment

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.gps.gyment.ui.components.BottomNavBar
import com.gps.gyment.ui.screens.HistoryScreen
import com.gps.gyment.ui.screens.HomeScreen
import com.gps.gyment.ui.screens.ProfileScreen


@Composable
fun GymentApp() {
    val navController = rememberNavController()

    Scaffold(
        bottomBar = { BottomNavBar(navController = navController, items = Routes.entries) }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = Routes.HOME.route,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(route = Routes.HOME.route) { HomeScreen() }
            composable(route = Routes.HISTORY.route) { HistoryScreen() }
            composable(route = Routes.PROFILE.route) { ProfileScreen() }
        }
    }
}