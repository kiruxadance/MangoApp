package ru.kiruxadance.core.network.model

data class MovieApiResponse<T>(
    val page: Int,
    val results: T,
    val total_pages: Int,
    val total_results: Int
)