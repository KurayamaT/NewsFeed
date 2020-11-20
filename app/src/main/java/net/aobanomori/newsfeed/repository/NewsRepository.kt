package net.aobanomori.newsfeed.repository

import android.content.Context
import net.aobanomori.newsfeed.data.News
import net.aobanomori.newsfeed.networking.ApiResponse
import net.aobanomori.newsfeed.networking.NewsApiService
import retrofit2.Response

class NewsRepository(private val context: Context){

    private val newsApiService: NewsApiService by lazy {
        NewsApiService.createApiService()
    }

    suspend fun getNews(searchWord: String):List<News>{

        val response:Response<ApiResponse> = newsApiService.getNews(searchWord)

    }



}