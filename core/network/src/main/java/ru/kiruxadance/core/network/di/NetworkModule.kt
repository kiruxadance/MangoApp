package ru.kiruxadance.core.network.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import ru.kiruxadance.core.network.MovieApiService
import ru.kiruxadance.core.network.providers.MovieListDataProviders

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {
    private const val MOVIE_API_BASE_URL = "https://api.themoviedb.org/"

    @Provides
    fun provideMovieApiService(): MovieApiService {
        return Retrofit.Builder().baseUrl(MOVIE_API_BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(MovieApiService::class.java)
    }

    @Provides
    fun provideMovieListDataProviders(apiService: MovieApiService): MovieListDataProviders {
        return MovieListDataProviders(apiService)
    }
}