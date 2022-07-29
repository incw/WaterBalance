package com.smolyakoff.waterbalance.NameScreen.Components

import androidx.compose.material.Icon
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Person
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)

@Composable
fun NameField() {

    var text by remember {
        mutableStateOf("")
    }

    OutlinedTextField(

        value = "",
        onValueChange = { text = it },
        label = { Text("Введите имя") },
        singleLine = true,
        leadingIcon = {

            Icon(
                imageVector = Icons.Outlined.Person,
                null

            )
        }
    )

}