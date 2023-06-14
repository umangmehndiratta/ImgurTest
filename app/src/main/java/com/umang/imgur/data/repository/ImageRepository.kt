package com.umang.imgur.data.repository

import com.umang.imgur.data.api.ImageApi
import com.umang.imgur.data.db.AppDatabase
import com.umang.imgur.data.model.FeedResponse
import com.umang.imgur.domain.model.Image
import retrofit2.Response

class ImageRepository(
    private val api : ImageApi,
    private val db : AppDatabase
) {
    suspend fun galleryImages(section : String, sort : String, window : String) : Response<FeedResponse> {
        return api.getGalleryImages(section, sort, window, "1",
            showViral = true,
            showMature = true,
            albumPreview = true
        )
    }

    suspend fun saveImages(images : List<Image>) {
        db.getImageDao().deleteImages()
        db.getImageDao().saveImages(images)
    }

    suspend fun getAllSavedImages() : List<Image> {
        return db.getImageDao().getAllSavedImages()
    }
}