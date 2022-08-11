package com.smolyakoff.waterbalance.objectiveScreen.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.toSize

@Preview(showBackground = true)
@Composable
fun MaleMenu() {

    var expanded by remember {
        mutableStateOf(false)
    }

    var select by remember {
        mutableStateOf("")
    }
    var size by remember {
        mutableStateOf(Size.Zero)
    }
    var list = listOf("Мужчина", "Женщина")

    OutlinedTextField(
        value = select,
        onValueChange = { select = it },

        modifier = Modifier
            .fillMaxWidth()
            .onGloballyPositioned { coordinates ->
                size = coordinates.size.toSize()
            },

        label = { Text(text = "Выберите пол") },

        leadingIcon = {
            Icon(
                imageVector = Icons.Default.Person,
                null
            )
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