package com.example.sunny.pages.musicInfo.contract

/**
 * Create on 18.7.13 0:02
 * <p>
 * author Zhang Zhixiang
 * <p>
 * Description:
 */
interface InfoContract {

    interface IView {
        fun showBgPic(url: String)
        fun showErr(msg: String)
    }

    interface IPresenter {
        fun loadMusicInfoData(musicIds: String)
    }

}