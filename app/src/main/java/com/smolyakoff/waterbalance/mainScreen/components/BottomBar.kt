package com.smolyakoff.waterbalance.mainScreen.components

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.smolyakoff.waterbalance.navigation.Screen

@Composable
fun BottomBar(navController: NavController){
    val items = listOf(
        Screen.Main,
        Screen.Counter,
        Screen.Profile,
        Screen.Settings
    )

    BottomNavigation(
        backgroundColor = Color.White,
        contentColor = Color.Gray
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
                label = {Text(text = items.title,
                    fontSize = 10.sp
                )},
                selectedContentColor = Color.Cyan,
                unselectedContentColor = Color.Cyan.copy(0.5f),
                alwaysShowLabel = true,
                selected = current == items.route,
                onClick = {
                    navController.navigate(items.route){


                        navController.graph.startDestinationRoute?.let {
                            route -> popUpTo(route){
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