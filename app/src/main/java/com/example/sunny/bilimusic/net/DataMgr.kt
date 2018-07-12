package com.example.sunny.bilimusic.net

import com.example.sunny.bilimusic.service.MusicService
import retrofit2.Retrofit

/**
 * Create on 18.7.12 14:31
 * <p>
 * author Zhang Zhixiang
 * <p>
 * Description:
 */
object DataMgr {

    private var retrofit: Retrofit = NetUtil.getRetrofit()

    var service: MusicService

    init {
        service = retrofit.create(MusicService::class.java)
    }

}