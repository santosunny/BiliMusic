package com.example.sunny.pages.musicInfo.presenter

import com.example.sunny.bilimusic.bean.MusicInfo
import com.example.sunny.bilimusic.net.DataMgr
import com.example.sunny.pages.musicInfo.contract.InfoContract
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * Create on 18.7.13 0:07
 * <p>
 * author Zhang Zhixiang
 * <p>
 * Description:
 */
class InfoPresenter(val iView: InfoContract.IView) : InfoContract.IPresenter {

    override fun loadMusicInfoData(musicIds: String) {
        DataMgr.service.getMusicInfo(musicIds).enqueue(object : Callback<MusicInfo> {

            override fun onFailure(call: Call<MusicInfo>?, t: Throwable?) {
                iView.showErr(t?.message.toString())
            }

            override fun onResponse(call: Call<MusicInfo>?, response: Response<MusicInfo>?) {
                val musicInfo = response?.body()
                val albumImg = musicInfo?.image
                iView.showBgPic(albumImg!!)
            }

        })
    }

}