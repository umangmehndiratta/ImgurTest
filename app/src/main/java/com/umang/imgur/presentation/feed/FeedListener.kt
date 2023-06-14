package com.umang.imgur.presentation.feed

import com.umang.imgur.domain.model.Image

interface FeedListener {
    fun onSuccess(imgList : List<Image>)
    fun onFailure(message : String)
}