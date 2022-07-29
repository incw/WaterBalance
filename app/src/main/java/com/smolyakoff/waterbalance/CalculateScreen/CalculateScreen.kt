package com.smolyakoff.waterbalance.CalculateScreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.smolyakoff.waterbalance.CalculateScreen.components.AcceptButton
import com.smolyakoff.waterbalance.CalculateScreen.components.AgeField
import com.smolyakoff.waterbalance.CalculateScreen.components.WeightField

@Composable
fun CalculateScreen() {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {

        AgeField()
        WeightField()
        AcceptButton {
            TODO()
        }
    }

}