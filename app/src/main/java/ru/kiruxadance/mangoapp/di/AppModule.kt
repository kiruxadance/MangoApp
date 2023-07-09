package ru.kiruxadance.mangoapp.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import ru.kiruxadance.feature_splash.presentation.navigation.SplashApi
import ru.kiruxadance.mangoapp.navigation.NavigationProvider

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    fun provideNavigationProvider(splashApi: SplashApi) : NavigationProvider {
        return NavigationProvider(splashApi)
    }
}