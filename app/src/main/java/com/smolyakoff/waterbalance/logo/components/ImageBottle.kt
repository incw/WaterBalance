package com.smolyakoff.waterbalance.logo.components

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.smolyakoff.waterbalance.R

@Composable
fun Bottle(){
    Image(
        painter = painterResource(id = R.drawable.bottle),
        null
    )
}