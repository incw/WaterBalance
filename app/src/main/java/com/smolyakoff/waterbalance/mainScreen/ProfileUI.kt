package com.smolyakoff.waterbalance.mainScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.smolyakoff.waterbalance.mainScreen.components.BottomBar
import com.smolyakoff.waterbalance.mainScreen.components.MainNavigate

@Preview
@Composable
fun ProfileUI(){


    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        ScreenView()
    }
}


@Composable
fun ScreenView(){
    val navController = rememberNavController()
    Scaffold(bottomBar = {
        BottomBar(navController = navController)
    }){
        MainNavigate(navController = navController)
    }
}