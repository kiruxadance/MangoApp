package ru.kiruxadance.core.network.providers

import ru.kiruxadance.core.network.MovieApiService
import javax.inject.Inject

class MovieListDataProviders @Inject constructor(
    private val apiService: MovieApiService
) {
    suspend fun getPopular(page: Int, language: String, token: String) =
        apiService.movieList.getPopular(language, page, token)
}