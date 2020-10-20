package net.aobanomori.newsfeed.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import net.aobanomori.newsfeed.data.News
import net.aobanomori.newsfeed.repository.NewsRepository

class MainViewModel(private val app: Application): AndroidViewModel(app) {

    private val repository: NewsRepository by lazy{
        NewsRepository(app)
    }

    val newsList = MutableLiveData<List<News>>()

    fun getNews(searchWord: String) {
        newsList.value = repository.getNews(searchWord)

    }
}




