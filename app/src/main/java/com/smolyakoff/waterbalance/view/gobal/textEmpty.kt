package com.smolyakoff.waterbalance.view.gobal

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.smolyakoff.waterbalance.R

@Preview
@Composable

fun TextEmpty(){
    Text(
        stringResource(id = R.string.empty),
        color = Color.Red
    )
}