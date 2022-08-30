package com.smolyakoff.waterbalance.view.mainScreen.screens.settings

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.smolyakoff.waterbalance.view.background.Background
import com.smolyakoff.waterbalance.view.mainScreen.screens.settings.components.ButtonTheme

@Preview
@Composable
fun Settings() {

    Background()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 10.dp, vertical = 30.dp),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        ButtonTheme()
    }

}