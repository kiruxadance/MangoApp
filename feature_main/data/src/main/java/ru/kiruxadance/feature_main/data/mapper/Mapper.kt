package ru.kiruxadance.feature_main.data.mapper

import ru.kiruxadance.core.network.model.MovieDto
import ru.kiruxadance.feature_main.domain.model.Movie

fun List<MovieDto>.toMovieList(): List<Movie> {
    return this.map {
        Movie(
            id = it.id,
            poster_path = it.poster_path
        )
    }
}