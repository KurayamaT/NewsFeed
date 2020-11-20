package net.aobanomori.newsfeed.networking

import com.squareup.moshi.Json
import net.aobanomori.newsfeed.data.News

class ApiResponse (
    @Json(name = "articles") val newsList: List<News>

)
