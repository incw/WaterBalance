package com.smolyakoff.waterbalance.view.mainScreen.components

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState

@Composable
fun BottomBar(navController: NavController) {
    val items = listOf(
        Screen.Main,
        Screen.Counter,
        Screen.Profile,
        Screen.Settings
    )

    BottomNavigation(
        backgroundColor = MaterialTheme.colors.background,
    ) {
        val navBack by navController
            .currentBackStackEntryAsState()

        val current = navBack?.destination?.route

        items.forEach { items ->
            BottomNavigationItem(
                icon = {
                    Icon(
                        imageVector = items.icon,
                        null
                    )
                },
                label = { Text(text = items.title, fontSize = 13.sp) },

                selectedContentColor = MaterialTheme.colors.primary,
                unselectedContentColor = MaterialTheme.colors.primary.copy(0.3f),

                alwaysShowLabel = true,

                selected = current == items.route,

                onClick = {
                    navController.navigate(items.route) {


                        navController.graph.startDestinationRoute?.let { route ->
                            popUpTo(route) {
                                saveState = true
                            }
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            )
        }
    }
}