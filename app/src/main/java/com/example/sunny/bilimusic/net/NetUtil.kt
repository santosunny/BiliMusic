package com.example.sunny.bilimusic.net

import com.example.sunny.bilimusic.config.NetworkConfig
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Create on 18.7.12 12:57
 * <p>
 * author Zhang Zhixiang
 * <p>
 * Description:
 */
object NetUtil {

    fun getRetrofit(): Retrofit = Retrofit.Builder()
            .baseUrl(NetworkConfig.server) //设置网络请求的Url地址
            .addConverterFactory(GsonConverterFactory.create()) //设置数据解析器
            .build()

}