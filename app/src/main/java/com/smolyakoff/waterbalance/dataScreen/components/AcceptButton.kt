package com.smolyakoff.waterbalance.dataScreen.components

import android.content.Intent
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import com.smolyakoff.waterbalance.objectiveScreen.ObjectiveActivity

@Composable
fun AcceptButton() {

    val context = LocalContext.current

    Button(
        onClick = {
            context.startActivity(Intent(context,ObjectiveActivity::class.java))
        }
    ) {
        Text("Далее")
    }
}