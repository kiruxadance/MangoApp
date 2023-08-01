package ru.kiruxadance.feature_main.data.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import ru.kiruxadance.core.network.providers.MovieListDataProviders
import ru.kiruxadance.feature_main.data.repository.MovieListRepositoryImpl
import ru.kiruxadance.feature_main.domain.repository.MovieListRepository

@Module
@InstallIn(SingletonComponent::class)
object DataModule {
    @Provides
    fun provideMovieListRepository(movieListDataProviders: MovieListDataProviders): MovieListRepository {
        return MovieListRepositoryImpl(movieListDataProviders)
    }
}