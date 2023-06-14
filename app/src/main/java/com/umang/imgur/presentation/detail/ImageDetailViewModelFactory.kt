package com.umang.imgur.presentation.detail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.umang.imgur.domain.model.Image

class ImageDetailViewModelFactory (

    var image: Image? = null

) : ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return ImageDetailViewModel(image) as T
    }
}