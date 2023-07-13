package com.example.themoviedb_uas.services

import com.example.themoviedb_uas.models.MovieResponse
import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {
    @GET("/3/movie/popular?api_key=eb6133e688d045e39e90145a16d58623")
    fun getMovieList(): Call<MovieResponse>

}