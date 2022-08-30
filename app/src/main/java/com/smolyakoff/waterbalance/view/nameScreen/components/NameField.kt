package com.smolyakoff.waterbalance.view.nameScreen.components

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Person
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue


@Composable
fun NameField() {

    var namePerson by rememberSaveable {
        mutableStateOf("")
    }

    OutlinedTextField(
        value = namePerson,
        onValueChange = {
            namePerson = it
        },

        label = { Text("Имя") },
        singleLine = true,
        colors = TextFieldDefaults.outlinedTextFieldColors(
            textColor = MaterialTheme.colors.secondary
        ),
        leadingIcon = {

            Icon(
                imageVector = Icons.Outlined.Person,
                null

            )
        }
    )
}