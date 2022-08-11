package com.smolyakoff.waterbalance.buttons

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun CalculateButton(
    onClick: () -> Unit,
){
    Button(
        onClick = onClick,
    ) {
        Text(text = "Рассчитать")
    }
}