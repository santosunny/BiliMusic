package com.example.sunny.pages.home.presenter

import com.example.sunny.bilimusic.bean.SearchResult
import com.example.sunny.bilimusic.net.DataMgr
import com.example.sunny.pages.home.contract.HomeContract
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * Create on 18.7.12 13:59
 * <p>
 * author Zhang Zhixiang
 * <p>
 * Description:
 */

class HomePresenter(val iView: HomeContract.IView) : HomeContract.IPresenter {

    override fun getSearchResult(name: String) {
        DataMgr.service.getSearchResultList(name).enqueue(object : Callback<SearchResult> {

            override fun onFailure(call: Call<SearchResult>?, t: Throwable?) {
                iView.showEmptyView(t?.message.toString())
            }

            override fun onResponse(call: Call<SearchResult>?, response: Response<SearchResult>?) {

                val isNull = response == null

                if (isNull || response?.body()?.musics?.size == 0) {
                    iView.showEmptyView("没有找到")
                }

                iView.showSearchResultList(response?.body())
            }

        })
    }

}