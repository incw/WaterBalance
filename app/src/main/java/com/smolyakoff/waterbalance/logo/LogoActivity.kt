package com.smolyakoff.waterbalance.logo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

class LogoActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LogoUI()
        }
    }
}
