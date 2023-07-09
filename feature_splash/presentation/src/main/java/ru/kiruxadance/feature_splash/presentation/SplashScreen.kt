package ru.kiruxadance.feature_splash.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import ru.kiruxadance.feature_splash.presentation.ui.theme.MangoAppTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SplashScreen(
    viewModel: SplashViewModel,
    navController: NavController
) {
    val scaffoldState = rememberScrollState()
    
    Scaffold() { contentPadding ->
        Column(modifier = Modifier.padding(contentPadding)) {
            Text(text = "Hello Splash")
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SplashScreen() {
    val scaffoldState = rememberScrollState()

    Scaffold() { contentPadding ->
        Column(modifier = Modifier.padding(contentPadding)) {
            Text(text = "Hello Splash")
        }
    }
}

@Preview
@Composable
fun SplashScreenPreview() {
    MangoAppTheme {
        SplashScreen()
    }
}
