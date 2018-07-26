package com.example.sunny.pages.home

import android.annotation.SuppressLint
import android.content.Context
import android.support.constraint.ConstraintLayout
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

    fun getItem(position: Int): SearchResult.MusicsBean {
        return list[position]
    }

    @SuppressLint("InflateParams")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.layout_music_result, null)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int =
            list.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.textView.text = list[position].title
        holder.imageView.loadImg(context, list[position].image)

        holder.ll.setOnClickListener {
            if (onMusicClickListener != null) {
                onMusicClickListener?.itemClicked(position)
            }
        }

    }

    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val ll: ConstraintLayout = view.findViewById(R.id.ll)
        val imageView: ImageView = view.findViewById(R.id.imageView)
        val textView: TextView = view.findViewById(R.id.textView)
    }

    interface OnMusicClickListener {
        fun itemClicked(position: Int)
    }

    private var onMusicClickListener: OnMusicClickListener? = null

    fun setOnMusicClickListener(onMusicClickListener1: OnMusicClickListener) {
        this.onMusicClickListener = onMusicClickListener1
    }

}