package com.example.viewmodelapp

import retrofit2.Call
import retrofit2.http.GET

interface EndPointAPI {

    @GET(ConstantsRestApi.POSTS)
    fun getAllPost(): Call<List<Post>>

    @GET(ConstantsRestApi.USERS)
    fun getAllUsers(): Call<List<User>>
}