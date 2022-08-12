package com.smolyakoff.waterbalance.background

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.smolyakoff.waterbalance.ui.theme.BlueLight

@Preview(showBackground = true)
@Composable
fun Background(){
    Box(
        modifier = Modifier.fillMaxSize()
            .background(
                Brush.verticalGradient(
                    colors = listOf(
                        Color.White,
                        BlueLight
                    )
                )
            )
    )
}