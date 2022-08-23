package com.smolyakoff.waterbalance.view.nameScreen.screens

import android.content.Intent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import com.smolyakoff.waterbalance.view.background.Background
import com.smolyakoff.waterbalance.view.dataScreen.CalculateActivity

import com.smolyakoff.waterbalance.view.nameScreen.components.ButtonAccept
import com.smolyakoff.waterbalance.view.nameScreen.components.NameField

@Composable
fun NameScreen() {

    Background()

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
                    CalculateActivity::class.java))
        })

    }
}