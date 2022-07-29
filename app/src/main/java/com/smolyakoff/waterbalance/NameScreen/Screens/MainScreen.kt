package com.smolyakoff.waterbalance.NameScreen.Screens

import android.content.Intent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import com.smolyakoff.waterbalance.CalculateScreen.CalculateActivity

import com.smolyakoff.waterbalance.NameScreen.Components.ButtonAccept
import com.smolyakoff.waterbalance.NameScreen.Components.NameField

@Composable
fun NameScreen() {

    val context = LocalContext.current

    Column(
        modifier = Modifier.fillMaxSize(),
        Arrangement.Center,
        Alignment.CenterHorizontally
    ) {

        NameField()
        ButtonAccept(onClick = {
            context.startActivity(
                Intent(
                    context,
                    CalculateActivity::class.java
                )
            )
        })

    }
}