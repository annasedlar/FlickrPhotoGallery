package com.bignerdranch.android.flickrphotogallery

import retrofit2.Call
import retrofit2.http.GET

interface FlickrApi {
    @GET("/")
    fun fetchContents(): Call<String>
}