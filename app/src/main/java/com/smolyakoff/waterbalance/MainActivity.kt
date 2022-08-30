package com.smolyakoff.waterbalance

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.compose.rememberNavController
import com.smolyakoff.waterbalance.navigation.SetupNavGraph
import com.smolyakoff.waterbalance.ui.theme.WaterBalanceTheme
import com.smolyakoff.waterbalance.view.nameScreen.screens.MainViewModel

class MainActivity : ComponentActivity() {

    lateinit var mViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WaterBalanceTheme {
                val navController = rememberNavController()
                SetupNavGraph(navController = navController)
            }
            mViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        }
    }
}
