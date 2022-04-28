package com.masterandroid.pinterest_demo.model.networking

import com.masterandroid.pinterest_demo.model.model.ResponseItem
import com.masterandroid.pinterest_demo.model.model.User
import com.masterandroid.pinterest_demo.model.modelSearch.Result
import com.masterandroid.pinterest_demo.model.modelSearch.Welcome
import com.masterandroid.pinterest_demo.model.modelSearchFrag.CollectionsModelItem
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface HomeService {

     //fragment1 all
    @GET("photos/random?count=100")
    fun listPhotos1(): Call<ArrayList<ResponseItem>>

    @GET("search/photos?page=1&per_page=19&query=")
    fun searchPhotos(@Query("page") page: Int, @Query("query") search: String): Call<Welcome>

    @GET("users/{username}")
    fun getUser(@Path("username") username: String): Call<User>

    @GET("photos/{id}")
    fun getImagesCategories(@Path("id") id: String): Call<Result>

    @GET("collections/")
    fun getCollections(): Call<List<CollectionsModelItem>>
}



//    @GET("photos/{id}")
//    fun singlePhotos(@Path("id")id:Int):Call<ResponseItem>
//
//    @POST("photos")
//    fun createPhotos(@Body post: ResponseItem):Call<ResponseItem>
//
//    @PUT("photos/{id}")
//    fun updatePhotos(@Path("id")id: Int,@Body post: ResponseItem):Call<ResponseItem>
//
//    @DELETE("photos/{id}")
//    fun deletePhotos(@Path("id")id:Int):Call<ResponseItem>

    //    @GET("search/photos?")
////    @GET("search/photos?page=2&query=tourism")
//    fun searchPhotos(@Query("query") search: String) : Call<Welcome>
////    fun searchPhotos() : Call<Welcome>