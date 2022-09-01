package com.smolyakoff.waterbalance.view.mainScreen.screens.settings.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Palette
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun ButtonTheme() {

    val openDialog = remember {
        mutableStateOf(false)
    }


    TextButton(
        onClick = { openDialog.value = true },
    ) {
        Icon(imageVector = Icons.Default.Palette, "palette icon")

        Text(
            text = "Тема",
            color = MaterialTheme.colors.secondary
        )

    }
    if (openDialog.value) {
        AlertDialog(
            onDismissRequest = { openDialog.value = false },
            contentColor = MaterialTheme.colors.background,
            title = { RadioButtonsTheme() },
            confirmButton = {
                Button(
                    onClick = { openDialog.value = false }
                ) {
                    Text(text = "OK")
                }
            }
        )
    }
}

@Composable
fun RadioButtonsTheme() {

    val choiceThemeApp = listOf("Системная", "Светлая", "Ночная")

    val (selectedOption, onOptionSelected)  = remember {
        mutableStateOf(choiceThemeApp[0])
    }

    Column(modifier = Modifier.selectableGroup()) {

        choiceThemeApp.forEach { text ->

            Row(
                modifier = Modifier
                    .selectableGroup()
                    .fillMaxWidth()
                    .height(50.dp)

                    .selectable(
                        selected = (text == selectedOption),
                        onClick = { onOptionSelected(text) }
                    )
            ) {

                RadioButton(
                    selected = (text == selectedOption),
                    onClick = {onOptionSelected(text)}
                )

                Text(
                    text = text,
                    color = MaterialTheme.colors.secondary,
                    modifier = Modifier.padding(horizontal = 1.dp, vertical = 9.dp),
                    fontSize = 20.sp
                )
            }
        }
    }
}

