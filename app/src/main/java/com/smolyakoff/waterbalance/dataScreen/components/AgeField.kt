package com.smolyakoff.waterbalance.dataScreen.components

import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)

@Composable
fun AgeField() {

    var textAge by remember {
        mutableStateOf("")
    }

    OutlinedTextField(

        value = textAge,
        onValueChange = { textAge = it },
        label = { Text("Возраст") },
        singleLine = true,
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Number
        )
    )

}