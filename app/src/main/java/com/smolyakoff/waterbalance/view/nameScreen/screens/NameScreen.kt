package com.smolyakoff.waterbalance.view.nameScreen.screens

import android.content.Intent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.smolyakoff.waterbalance.view.background.Background
import com.smolyakoff.waterbalance.view.mainScreen.ProfileActivity
import com.smolyakoff.waterbalance.view.nameScreen.components.ButtonAccept
import com.smolyakoff.waterbalance.view.nameScreen.components.GenderMenu
import com.smolyakoff.waterbalance.view.nameScreen.components.NameField
import com.smolyakoff.waterbalance.view.nameScreen.components.WeightField


@Preview
@Composable
fun NameScreen() {

    val context = LocalContext.current

//    val mUsViewModel: UserViewModel = viewModel(
//        factory =UserViewModelFactory(context.applicationContext as Application)
//    )

   // val items = mUsViewModel.readAllData.observeAsState(listOf()).value

    Background()


    Column(
        modifier = Modifier.fillMaxSize(),
        Arrangement.Center,
        Alignment.CenterHorizontally
    ) {

        NameField()
        WeightField()
        GenderMenu()
        ButtonAccept(onClick = {
            context.startActivity(
                Intent(
                    context,
                    ProfileActivity::class.java))
        })

    }
}