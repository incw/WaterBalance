package com.smolyakoff.waterbalance.view.nameScreen.components

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun ButtonNext(
    onClick: () -> Unit,

    ) {
    Button(
        onClick = onClick,

        ) {
        Text(
            text = "OK",
            color = MaterialTheme.colorScheme.background
        )
    }
}