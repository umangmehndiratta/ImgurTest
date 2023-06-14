package com.umang.imgur.presentation.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.umang.imgur.domain.model.Image
import com.umang.imgur.presentation.base.BaseViewModel

class ImageDetailViewModel(
    private val image : Image? = null
) : BaseViewModel() {

    private val imageLiveData = MutableLiveData<Image>()

    fun loadData() {
        image?.let {
            imageLiveData.postValue(it)
        }
    }

    fun getImageLiveData(): LiveData<Image> = imageLiveData

}