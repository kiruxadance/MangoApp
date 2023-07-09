package ru.kiruxadance.mangoapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import ru.kiruxadance.core.common.navigation_constants.SplashFeature

@Composable
fun AppNavGraph(
    navController: NavHostController,
    navigationProvider: NavigationProvider
) {
    NavHost(navController = navController, startDestination = SplashFeature.nestedRoute ) {
        navigationProvider.SplashApi.registerGraph(navController, this)
    }
}