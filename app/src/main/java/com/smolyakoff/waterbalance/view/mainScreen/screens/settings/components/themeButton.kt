package com.smolyakoff.waterbalance.view.mainScreen.screens.settings.components

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Palette
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun ButtonTheme() {

    val context = LocalContext.current

    val openDialog = remember {
        mutableStateOf(false)
    }

    val themeChanged = listOf("Системная", "Светлая", "Ночная")

    val (selectedOption, onOptionSelected) = remember {
        mutableStateOf(themeChanged[0])
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
            title = { Text(text = "Тема",color = MaterialTheme.colors.secondary)},

            contentColor = MaterialTheme.colors.background,
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

