package com.example.sunny.pages.musicInfo.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.sunny.bilimusic.R
import com.example.sunny.bilimusic.loadImg
import com.example.sunny.bilimusic.toast
import com.example.sunny.pages.musicInfo.contract.InfoContract
import com.example.sunny.pages.musicInfo.presenter.InfoPresenter
import kotlinx.android.synthetic.main.activity_music_info.*

class MusicInfoActivity : AppCompatActivity(), InfoContract.IView {

    var id = ""
    lateinit var presenter: InfoPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_music_info)

        presenter = InfoPresenter(this)
        id = intent.getStringExtra("id")
        toast("info page $id")

        loadMusicInfo(id)
    }

    private fun loadMusicInfo(musicId: String) {
        presenter.loadMusicInfoData(musicId)
    }

    override fun showBgPic(url: String) {
        iv.loadImg(this, url)
    }

    override fun showErr(msg: String) {
        toast(msg)
    }
}
