package com.smolyakoff.waterbalance

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.ViewModel
import androidx.navigation.compose.rememberNavController
import com.smolyakoff.waterbalance.navigation.SetupNavGraph
import com.smolyakoff.waterbalance.ui.theme.WaterBalanceTheme

class MainActivity : ComponentActivity() {

    lateinit var mViewModel: ViewModel

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
