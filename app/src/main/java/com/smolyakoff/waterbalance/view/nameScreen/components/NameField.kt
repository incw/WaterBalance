package com.smolyakoff.waterbalance.view.nameScreen.components

import androidx.compose.material.Icon
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Person
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue


@Composable
fun NameField(){

    var name by rememberSaveable{
        mutableStateOf("")
    }

    OutlinedTextField(
        value = name,
        onValueChange = {
            name = it
                        },

        label = { Text("Имя") },
        singleLine = true,
        leadingIcon = {

            Icon(
                imageVector = Icons.Outlined.Person,
                null

            )
        }
    )
}