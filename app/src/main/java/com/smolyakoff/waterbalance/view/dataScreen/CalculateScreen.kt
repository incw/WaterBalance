package com.smolyakoff.waterbalance.view.dataScreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.smolyakoff.waterbalance.view.background.Background
import com.smolyakoff.waterbalance.view.dataScreen.components.AcceptButton
import com.smolyakoff.waterbalance.view.dataScreen.components.AgeField
import com.smolyakoff.waterbalance.view.dataScreen.components.WeightField
import com.smolyakoff.waterbalance.view.objectiveScreen.components.GenderMenu

@Composable
fun CalculateScreen() {
    Background()
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {

        AgeField()
        WeightField()
        GenderMenu()
        AcceptButton()
    }

}