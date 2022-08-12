package com.smolyakoff.waterbalance

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.smolyakoff.waterbalance.logo.navigation.SetupNavGraph
import com.smolyakoff.waterbalance.ui.theme.WaterBalanceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WaterBalanceTheme{
                val navController = rememberNavController()
                SetupNavGraph(navController = navController)
            }
        }
    }
}
