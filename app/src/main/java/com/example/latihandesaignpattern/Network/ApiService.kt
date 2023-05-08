package com.example.latihandesaignpattern.Network

import com.example.latihandesaignpattern.Model.getAllUserItem
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("user")
    fun getUser(): Call<List<getAllUserItem>>
}