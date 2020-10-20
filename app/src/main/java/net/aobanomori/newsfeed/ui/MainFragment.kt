package net.aobanomori.newsfeed.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import kotlinx.android.synthetic.main.fragment_main.*
import net.aobanomori.newsfeed.R
import net.aobanomori.newsfeed.viewmodel.MainViewModel


class MainFragment : Fragment() {

    private val viewModel: MainViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

//        viewModel = ViewModelProvider.of(activity!!).get(MainViewModel::class.java)

        searchButton.setOnClickListener {
            viewModel.getNews(inputSearchWord.text.toString())
        }
    }


}