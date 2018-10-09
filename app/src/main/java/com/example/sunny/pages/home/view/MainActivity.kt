package com.example.sunny.pages.home.view

import android.content.Intent
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import com.example.sunny.bilimusic.R
import com.example.sunny.bilimusic.base.BaseActivity
import com.example.sunny.bilimusic.bean.SearchResult
import com.example.sunny.bilimusic.toast
import com.example.sunny.pages.home.SearchAdapter
import com.example.sunny.pages.home.contract.HomeContract
import com.example.sunny.pages.home.presenter.HomePresenter
import com.example.sunny.pages.musicInfo.view.MusicInfoActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity :
        BaseActivity(),
        HomeContract.IView,
        View.OnClickListener,
        SearchAdapter.OnMusicClickListener {

    private lateinit var presenter: HomePresenter
    private lateinit var searchAdapter: SearchAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = HomePresenter(this)
        initViews()
        configRv()
    }

    override fun showSearchResultList(result: SearchResult?) {
        val musicList =
                result?.musics

        val list =
                musicList as ArrayList<SearchResult.MusicsBean>

        searchAdapter.addData2List(list)
    }

    private fun getMusicList() {
        val name = et.text.toString().trim()
        presenter.getSearchResult(name)
    }

    override fun showEmptyView(msg: String) {
        toast("$msg（-_-!!）")
    }

    override fun itemClicked(position: Int) {
        val musicId = searchAdapter.getItem(position).id

        val intent2 = Intent(this, MusicInfoActivity::class.java)
        intent2.putExtra("id", musicId)
        startActivity(intent2)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn -> {
                getMusicList()
            }
        }
    }

    private fun initViews() {
        btn.setOnClickListener(this)
    }

    private fun configRv() {
        searchAdapter = SearchAdapter(this)
        searchAdapter.setOnMusicClickListener(this)

        rv.layoutManager = LinearLayoutManager(this)
        rv.adapter = searchAdapter
    }

}