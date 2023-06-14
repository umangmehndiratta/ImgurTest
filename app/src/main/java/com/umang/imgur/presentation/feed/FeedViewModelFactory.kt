package com.umang.imgur.presentation.feed

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.umang.imgur.data.repository.ImageRepository

class FeedViewModelFactory(
    private val repository: ImageRepository
) : ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return FeedViewModel(repository) as T
    }
}