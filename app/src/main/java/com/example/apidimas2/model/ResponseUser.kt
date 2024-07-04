package com.example.apidimas2.model
import com.google.gson.annotations.SerializedName

data class ResponseUser(
        @SerializedName("data")
        val data: List<DataItem>? = null
)
