package com.example.sunny.pages.home

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.sunny.bilimusic.R
import com.example.sunny.bilimusic.bean.SearchResult
import com.example.sunny.bilimusic.loadImg

/**
 * Create on 18.7.12 15:27
 * <p>
 * author Zhang Zhixiang
 * <p>
 * Description:
 */
class SearchAdapter(private val context: Context) :
        RecyclerView.Adapter<SearchAdapter.MyViewHolder>() {

    private val list = ArrayList<SearchResult.MusicsBean>()

    fun addData2List(newList: ArrayList<SearchResult.MusicsBean>) {
        list.clear()
        list.addAll(newList)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(context).inflate(R.layout.layout_music_result, parent, false))
    }

    override fun getItemCount(): Int =
            list.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.textView.text = list[position].title
        holder.imageView.loadImg(context, list[position].image)
    }

    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imageView: ImageView = view.findViewById(R.id.imageView)
        val textView: TextView = view.findViewById(R.id.textView)
    }

}