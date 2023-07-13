package com.example.themoviedb_uas.services


import com.example.themoviedb_uas.models.TVResponse
import retrofit2.Call
import retrofit2.http.GET

interface TVApiInterface {
    @GET("/3/tv/popular?api_key=eb6133e688d045e39e90145a16d58623")
    fun getTVList(): Call<TVResponse>
}