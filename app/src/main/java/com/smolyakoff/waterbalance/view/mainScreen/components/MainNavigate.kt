package com.smolyakoff.waterbalance.view.mainScreen.components

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.smolyakoff.waterbalance.view.mainScreen.screens.counter.Counter
import com.smolyakoff.waterbalance.view.mainScreen.screens.main.Main
import com.smolyakoff.waterbalance.view.mainScreen.screens.profile.Profile
import com.smolyakoff.waterbalance.view.mainScreen.screens.settings.Settings

@Composable
fun MainNavigate(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.Main.route
    ) {
        composable(route = Screen.Main.route) {
            Main()
        }
        composable(route = Screen.Counter.route) {
            Counter()
        }
        composable(route = Screen.Profile.route) {
            Profile()
        }
        composable(route = Screen.Settings.route) {
            Settings()
        }
    }
}