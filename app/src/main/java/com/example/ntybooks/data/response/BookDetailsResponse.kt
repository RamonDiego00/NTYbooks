package com.example.ntybooks.data.response

import com.squareup.moshi.Json

data class BookDetailsResponse (
    @Json(name = "title")
    val title:String,
    @Json(name = "author")
    val author: String,
    @Json(name = "description")
    val description:String
)