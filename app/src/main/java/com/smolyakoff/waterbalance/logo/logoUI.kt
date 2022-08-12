package com.smolyakoff.waterbalance.logo

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.smolyakoff.waterbalance.logo.components.Bottle
import com.smolyakoff.waterbalance.ui.theme.Blue

@Preview(showBackground = true)
@Composable
fun LogoUI() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors =
                    listOf(
                        Color.White,
                        Blue
                    )
                )
            ).alpha(0.7f),

        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Bottle()
        Text(text = "Water", color = Color.White, fontSize = 30.sp)
        Text(text = "Balance", color = Color.White, fontSize = 20.sp)
    }
}