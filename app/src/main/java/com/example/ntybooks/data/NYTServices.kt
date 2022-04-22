package com.example.ntybooks.data

import android.telecom.Call
import retrofit2.http.GET

import jdk.nashorn.internal.runtime.PropertyDescriptor.GET
import retrofit2.http.Query
import java.nio.channels.spi.AbstractSelectionKey


interface NYTServices {
    @GET("list.json")
    fun getBooks(
        @Query("api-key") apiKey: String = "Y9IbDR7htHdQmMPStlQo57IZK6BO5AS1",
        @Query("list") list:String = "hardcover-fiction"
    ): Call<BookBodyresponse>
}