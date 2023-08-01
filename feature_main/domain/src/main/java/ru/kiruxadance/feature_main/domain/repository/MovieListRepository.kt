package ru.kiruxadance.feature_main.domain.repository

import ru.kiruxadance.feature_main.domain.model.Movie

interface MovieListRepository {
    suspend fun getPopular(): List<Movie>
}