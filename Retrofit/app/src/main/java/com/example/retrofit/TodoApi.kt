package com.example.retrofit

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface TodoApi {
    @GET("/todos")
   suspend fun getTodos(): Response<List<Todo>>

}