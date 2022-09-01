package com.smolyakoff.waterbalance.view.gobal

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun ThemeText(text:String){
    Text(
        text = text,
        color = MaterialTheme.colors.secondary
    )
}