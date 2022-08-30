package com.smolyakoff.waterbalance.view.mainScreen.screens.counter

import androidx.compose.foundation.layout.size
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ProgressIndicator() {


    CircularProgressIndicator(
        modifier = Modifier.size(300.dp),
        progress = 0.1f,
        color = MaterialTheme.colors.primary
    )

}