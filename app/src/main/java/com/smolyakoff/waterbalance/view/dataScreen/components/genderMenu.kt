package com.smolyakoff.waterbalance.view.objectiveScreen.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.toSize

@Preview(showBackground = true)
@Composable
fun GenderMenu() {

    var expanded by remember {
        mutableStateOf(false)
    }

    var select by remember {
        mutableStateOf("")
    }
    var size by remember {
        mutableStateOf(Size.Zero)
    }
    val list = listOf("Мужчина", "Женщина")

    val icon = if (expanded)
        Icons.Filled.KeyboardArrowUp
    else
        Icons.Filled.KeyboardArrowDown
    Column(Modifier) {
    OutlinedTextField(
        value = select,
        onValueChange = { select = it },

        modifier = Modifier
            .onGloballyPositioned { coordinates ->
                size = coordinates.size.toSize()
            },
        singleLine = true,
        label = { Text(text = "Выберите пол") },

        leadingIcon = {
            Icon(
                imageVector = Icons.Default.Person,
                null
            )
        },
        trailingIcon = {
            Icon(icon,"contentDescription",
                Modifier.clickable { expanded = !expanded })
        }
    )
    DropdownMenu(
        expanded = expanded,
        onDismissRequest = { expanded = false },
    ) {

        list.forEach { label ->
            DropdownMenuItem(onClick = {

                select = label
                expanded = false

            }) {

                Text(text = label)
            }
        }
    }
}
}