package com.smolyakoff.waterbalance.view.dataScreen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent


class CalculateActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculateScreen()
        }
    }
}