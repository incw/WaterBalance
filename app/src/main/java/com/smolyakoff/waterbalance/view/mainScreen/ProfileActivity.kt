package com.smolyakoff.waterbalance.view.mainScreen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.ViewModelProvider
import com.smolyakoff.waterbalance.ui.theme.WaterBalanceTheme

class ProfileActivity : ComponentActivity() {

    lateinit var prfViewModel: ProfileViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            WaterBalanceTheme {
                ProfileUI()
            }

            prfViewModel = ViewModelProvider(this).get(ProfileViewModel::class.java)

        }
    }
}