package com.smolyakoff.waterbalance.objectiveScreen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

class ObjectiveActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ObjectiveUI()
        }
    }
}
