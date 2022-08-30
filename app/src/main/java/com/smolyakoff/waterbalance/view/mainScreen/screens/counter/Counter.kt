package com.smolyakoff.waterbalance.view.mainScreen.screens.counter

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.smolyakoff.waterbalance.R
import com.smolyakoff.waterbalance.view.background.Background

// STEP SCREEN
@Preview
@Composable
fun Counter() {
    Background()
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            stringResource(id = R.string.cel),
            fontSize = (20.sp),
            color = MaterialTheme.colors.secondary
        )
        ProgressIndicator()
    }

}