package com.smolyakoff.waterbalance.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Screen (
    val route: String,
    val icon:ImageVector,
    val title:String
    ){

    object Main: Screen("home",icon = Icons.Default.Home,"Главная")
    object Counter: Screen("counter", icon =  Icons.Default.DateRange,"Шагомер")
    object Profile: Screen("profile",icon =   Icons.Default.Person,"Профиль")
    object Settings: Screen("settings", icon = Icons.Default.Settings,"Настройки")

    object Splash: Screen("splash_screen", icon = Icons.Default.Lock,"splash")
    object Home: Screen("home_screen", icon = Icons.Default.Home,"Home")

}