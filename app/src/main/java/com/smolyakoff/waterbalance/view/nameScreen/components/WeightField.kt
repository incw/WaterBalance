package com.smolyakoff.waterbalance.view.nameScreen.components

import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.MonitorWeight
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
fun WeightField() {

    var textKG by rememberSaveable {
        mutableStateOf("")
    }
    OutlinedTextField(
        value = textKG,
        onValueChange = { textKG = it },
        label = { Text("Вес") },
        singleLine = true,
        colors = TextFieldDefaults.outlinedTextFieldColors(
            textColor = MaterialTheme.colors.secondary,
        ),
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Number
        ),
        leadingIcon = {
            Icon(imageVector = Icons.Outlined.MonitorWeight, null)
        }
    )
}