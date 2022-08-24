package com.smolyakoff.waterbalance.view.nameScreen.components

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.smolyakoff.waterbalance.R

@Composable
fun ButtonAccept(
    onClick: () -> Unit,

    ) {
    Button(
        onClick = onClick,
    ) {
        Text(stringResource(id = R.string.ok))
    }
}