package ru.kiruxadance.core.network

import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path
import ru.kiruxadance.core.network.model.MovieApiResponse
import ru.kiruxadance.core.network.model.MovieDto

interface MovieApiService {
    val movieList: MovieList
}

interface MovieList {
    @GET("3/movie/popular?language={language}&page={page}")
    suspend fun getPopular(
        @Path("language") language: String,
        @Path("page") page: Int,
        @Header("Authorization") token: String
    ): MovieApiResponse<List<MovieDto>>
}