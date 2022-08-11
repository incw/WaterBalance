package com.smolyakoff.waterbalance.objectiveScreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.smolyakoff.waterbalance.background.Background
import com.smolyakoff.waterbalance.objectiveScreen.components.MaleMenu


@Preview(showBackground = true)
@Composable
fun ObjectiveUI(){
    Background()
    Column(
        modifier = Modifier.fillMaxSize().padding(10.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        MaleMenu()
    }
}