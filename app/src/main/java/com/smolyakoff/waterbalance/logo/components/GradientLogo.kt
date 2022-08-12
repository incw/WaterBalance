package com.smolyakoff.waterbalance.logo.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.tooling.preview.Preview
import com.smolyakoff.waterbalance.ui.theme.Blue
import com.smolyakoff.waterbalance.ui.theme.BlueLight


@Preview(showBackground = true)
@Composable
fun BackgroundLogo(){
    Box(
        modifier = Modifier.fillMaxSize()
            .background(brush = Brush.verticalGradient(
                colors = listOf(
                    BlueLight,
                    Blue
                )
            ))
    )
}