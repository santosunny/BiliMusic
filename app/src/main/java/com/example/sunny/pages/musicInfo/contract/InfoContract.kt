package com.example.sunny.pages.musicInfo.contract

import com.example.sunny.bilimusic.bean.MusicInfo

/**
 * Create on 18.7.13 0:02
 * <p>
 * author Zhang Zhixiang
 * <p>
 * Description:
 */
interface InfoContract {

    interface IView {
        fun showInfo(musicInfo: MusicInfo)
        fun showErr(msg: String)
    }

    interface IPresenter {
        fun loadMusicInfoData(musicIds: String)
    }

}