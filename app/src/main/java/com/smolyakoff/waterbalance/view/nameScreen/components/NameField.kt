package com.smolyakoff.waterbalance.view.nameScreen.components

import androidx.compose.material.Icon
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Person
import androidx.compose.runtime.*


@Composable
fun NameField(){

    var name by remember{

        mutableStateOf("")

    }

    OutlinedTextField(

        value = name,
        onValueChange = { name = it },
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