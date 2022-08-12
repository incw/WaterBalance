package com.smolyakoff.waterbalance.logo

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.smolyakoff.waterbalance.R
import com.smolyakoff.waterbalance.ui.theme.Blue
import kotlinx.coroutines.delay

@Composable
fun Splash(alpha: Float) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors =
                    listOf(
                        Color.White,
                        Blue
                    )
                )
            )
            .alpha(0.7f),

        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Image(
            painter = painterResource(id = R.drawable.bottle),
            modifier = Modifier.alpha(alpha = alpha),
            contentDescription = null
        )

        Text(
            text = "Water",
            color = Color.White,
            fontSize = 30.sp,
            modifier = Modifier.alpha(alpha)
        )
        Text(
            text = "Balance",
            color = Color.White,
            fontSize = 20.sp,
            modifier = Modifier.alpha(alpha)
        )
    }
}

@Composable
fun AnimatedSplashScreen(navController: NavHostController) {
    var startAnimation by remember {
        mutableStateOf(false)
    }

    val alphaAnim = animateFloatAsState(
        targetValue = if (startAnimation) 1f else 0f,
        animationSpec = tween(
            durationMillis = 3000
        )
    )
    LaunchedEffect(key1 = true) {
        startAnimation = true
        delay(4000)
        navController.navigate(Screen.Home.route)
    }
    Splash(alpha = alphaAnim.value)

}

@Composable
fun SplashScreenPreview(){
    Splash(alpha = 1f)
}