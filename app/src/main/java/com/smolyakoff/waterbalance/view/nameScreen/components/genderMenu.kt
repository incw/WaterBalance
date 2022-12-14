package com.smolyakoff.waterbalance.view.nameScreen.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material.icons.outlined.People
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
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

    var select by rememberSaveable {
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
            colors = TextFieldDefaults.outlinedTextFieldColors(
                textColor = MaterialTheme.colors.secondary
            ),
            singleLine = true,
            label = { Text(text = "Пол") },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Outlined.People,
                    null
                )
            },
            trailingIcon = {
                Icon(icon, "select buttons",
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