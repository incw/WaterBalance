package com.smolyakoff.waterbalance.view.nameScreen.components

import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.MonitorWeight
import androidx.compose.runtime.*
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
fun WeightField() {

    var textKG by remember {
        mutableStateOf("")
    }
    OutlinedTextField(
        value = textKG,
        onValueChange = { textKG = it },
        label = { Text("Вес") },
        singleLine = true,
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Number
        ),
        leadingIcon = {
            Icon(imageVector = Icons.Outlined.MonitorWeight,null)
        }
    )
}