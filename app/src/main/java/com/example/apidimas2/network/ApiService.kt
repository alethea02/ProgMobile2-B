package com.example.apidimas2.network

import com.example.apidimas2.model.ResponseUser
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("data/VvNzKPjIHObXAttm")
    fun getListUsers(): Call<ResponseUser>

}
