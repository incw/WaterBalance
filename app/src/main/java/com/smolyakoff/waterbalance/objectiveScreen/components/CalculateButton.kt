package com.smolyakoff.waterbalance.objectiveScreen.components

import android.content.Intent
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import com.smolyakoff.waterbalance.mainScreen.ProfileActivity

@Composable
fun CalculateButton(
) {

    val context = LocalContext.current

    Button(
        onClick = {
            context.startActivity(
                Intent(
                    context,
                    ProfileActivity::class.java
                )
            )
        },

        ) {
        Text(text = "Рассчитать")
    }
}