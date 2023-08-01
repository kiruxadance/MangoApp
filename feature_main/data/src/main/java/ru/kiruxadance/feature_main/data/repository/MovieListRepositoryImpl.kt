package ru.kiruxadance.feature_main.data.repository

import ru.kiruxadance.core.network.providers.MovieListDataProviders
import ru.kiruxadance.feature_main.data.mapper.toMovieList
import ru.kiruxadance.feature_main.domain.model.Movie
import ru.kiruxadance.feature_main.domain.repository.MovieListRepository
import javax.inject.Inject

class MovieListRepositoryImpl @Inject constructor(
    private val movieListDataProviders: MovieListDataProviders
) : MovieListRepository {
    override suspend fun getPopular(): List<Movie> {
        return movieListDataProviders.getPopular(PAGE, LANGUAGE, TOKEN).results.toMovieList()
    }

    companion object {
        private const val PAGE = 1
        private const val LANGUAGE = "ru-RU"
        private const val TOKEN =
            "eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiJjNzI1ZTNiYTU0NTM3MWEzYTMzNmIwMWY0ZTBhYmE3YyIsInN1YiI6IjY0YzgwMGZiNDFhYWM0MGZiNTQ5MDEzZCIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.vHPcxkUDCYCeOSAs7wlj34qwfg8j2lj1Ka8kr71QbTQ"
    }
}