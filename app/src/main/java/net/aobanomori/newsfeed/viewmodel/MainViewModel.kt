package net.aobanomori.newsfeed.viewmodel

import android.app.Application
import androidx.lifecycle.*
import kotlinx.coroutines.launch
import net.aobanomori.newsfeed.data.News
import net.aobanomori.newsfeed.repository.NewsRepository

class MainViewModel(private val app: Application): AndroidViewModel(app) {

    private val repository: NewsRepository by lazy{
        NewsRepository(app)
    }

//    val newsList = MutableLiveData<List<News>>()
//
//    fun getNews(searchWord: String) {
//        searchWord?.let {
//            viewModelScope.launch {
//                newsList.value = repository.getNews(searchWord)
//            }
//        }
//    }
//}

    val searchWord = MutableLiveData<String>()
    fun getNews(word: String?){
        searchWord.value = word
    }
    val newsList: LiveData<List<News>> = Transformations.switchMap(searchWord){ word ->
        word?.let {
            liveData{
            emit(repository.getNews(it))
            }
        }
        }
    }





