package com.example.sunny.bilimusic.service

import com.example.sunny.bilimusic.bean.MusicInfo
import com.example.sunny.bilimusic.bean.SearchResult
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

/**
 * Create on 18.7.12 13:39
 * <p>
 * author Zhang Zhixiang
 * <p>
 * Description:
 */
interface MusicService {

    @GET("search")
    fun getSearchResultList(@Query("q") name: String): Call<SearchResult>

    @GET("{id}")
    fun getMusicInfo(@Path("id") id: String): Call<MusicInfo>

}