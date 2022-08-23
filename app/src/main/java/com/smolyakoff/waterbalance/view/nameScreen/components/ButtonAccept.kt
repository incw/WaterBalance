package com.smolyakoff.waterbalance.view.nameScreen.components

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun ButtonAccept(
    onClick: () -> Unit,

    ) {
    Button(
        onClick = onClick,
    ) {
        Text("Далее")
    }
}