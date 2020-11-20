package net.aobanomori.newsfeed.data

import com.squareup.moshi.Json

data class News(
    val title: String?,
    @Json(name = "publishedAt") val publishDate: String?,
    val url : String?,
    val description: String?,
    @Json(name = "urlToImage") val imageUrl: String?
)