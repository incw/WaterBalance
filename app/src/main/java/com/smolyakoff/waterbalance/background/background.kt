package com.smolyakoff.waterbalance.background

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.smolyakoff.waterbalance.R

@Preview(showBackground = true)
@Composable
fun Background(){

    Image(
        painter = painterResource(id = R.drawable.background_water),
        null,
        modifier = Modifier.fillMaxSize()
            .alpha(0.8f),
        contentScale = ContentScale.FillBounds
    )

}