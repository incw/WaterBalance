package com.smolyakoff.waterbalance.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.smolyakoff.waterbalance.view.logo.AnimatedSplashScreen
import com.smolyakoff.waterbalance.view.mainScreen.components.Screen
import com.smolyakoff.waterbalance.view.nameScreen.screens.NameScreen


@Composable
fun SetupNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.Splash.route
    ) {
        composable(route = Screen.Splash.route) {
            AnimatedSplashScreen(navController = navController)
        }
        composable(route = Screen.Home.route) {
            NameScreen()
        }
    }
}