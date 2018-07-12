package com.example.sunny.pages.home.contract

import com.example.sunny.bilimusic.bean.SearchResult

/**
 * Create on 18.7.12 13:47
 * <p>
 * author Zhang Zhixiang
 * <p>
 * Description:
 */
interface HomeContract {

    interface IView {
        fun showSearchResultList(result: SearchResult?)
        fun showEmptyView(msg: String)
    }

    interface IPresenter {
        fun getSearchResult(name: String)
    }

}