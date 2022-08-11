package com.smolyakoff.waterbalance.dataScreen.components

import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)

@Composable
fun AgeField() {

    var textAge by remember {
        mutableStateOf("")
    }

    OutlinedTextField(

        value = "",
        onValueChange = { textAge = it },
        label = { Text("Возраст") },
        singleLine = true,
    )

}