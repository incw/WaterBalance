package com.smolyakoff.waterbalance.calculateScreen.components

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun AcceptButton(
    onClick: () -> Unit,

    ) {
    Button(
        onClick = onClick,
    ) {
        Text("Далее")
    }
}