package com.smolyakoff.waterbalance.view.gobal

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import com.smolyakoff.waterbalance.ui.theme.lightColor

@Preview
@Composable
fun Slider() {

    var slider by rememberSaveable {
        mutableStateOf(0f)
    }

    Text(text = "Вес: $slider", color = lightColor)
    androidx.compose.material.Slider(
        value = slider,
        valueRange = 0f..200f,
        steps = 200,
        onValueChange = { slider = it },
    )

}
