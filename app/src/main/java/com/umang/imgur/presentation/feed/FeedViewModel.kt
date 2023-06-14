package com.umang.imgur.presentation.feed

import com.umang.imgur.data.mapper.ImageMapper
import com.umang.imgur.data.repository.ImageRepository
import com.umang.imgur.presentation.base.BaseViewModel
import com.umang.imgur.presentation.util.Coroutines

class FeedViewModel(
    private val repository: ImageRepository
) : BaseViewModel() {

    var feedListener: FeedListener? = null

    fun getGalleryImages(section : String, sort : String, window : String) {
        Coroutines.main {
            val feedResponse = repository.galleryImages(section, sort, window)
            if (feedResponse.isSuccessful) {
                feedResponse.body()?.data?.let {
                    val result = it.map { imgMap ->
                        ImageMapper.convertData(imgMap)
                    }
                    feedListener?.onSuccess(result)
                    repository.saveImages(result)
                    return@main
                }
            } else
                feedListener?.onFailure("Error Code: ${feedResponse.code()}")
        }

    }

    fun getCachedGalleryImages() {
        Coroutines.main {
            val savedImages = repository.getAllSavedImages()
            feedListener?.onSuccess(savedImages)
        }
    }
}