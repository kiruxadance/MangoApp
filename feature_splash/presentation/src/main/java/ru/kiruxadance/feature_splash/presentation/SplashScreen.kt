package ru.kiruxadance.feature_splash.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import ru.kiruxadance.feature_splash.presentation.ui.theme.MangoAppTheme
import ru.kiruxadance.feature_splash.presentation.ui.theme.Typography

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SplashScreen(
    viewModel: SplashViewModel,
    navController: NavController
) {
    val scaffoldState = rememberScrollState()
    
    Scaffold() { contentPadding ->
        Column(modifier = Modifier.padding(contentPadding).fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "Mango", style = Typography.titleLarge)
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SplashScreen() {
    val scaffoldState = rememberScrollState()

    Scaffold() { contentPadding ->
        Column(modifier = Modifier.padding(contentPadding).fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "Mango", style = Typography.titleLarge)
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
