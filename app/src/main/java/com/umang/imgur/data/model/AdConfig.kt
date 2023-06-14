package com.umang.imgur.data.model

import com.google.gson.annotations.SerializedName

data class AdConfig(
    @SerializedName("safeFlags")
    var safeFlags: List<String>? = null,

    @SerializedName("highRiskFlags")
    var highRiskFlags:List<Any>? = null,

    @SerializedName("unsafeFlags")
    var unsafeFlags: List<String>? = null,

    @SerializedName("wallUnsafeFlags")
    var wallUnsafeFlags: List<Any>? = null,

    @SerializedName("showsAds")
    var showsAds: Boolean? = null
)