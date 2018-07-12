package com.example.sunny.bilimusic

import android.content.Context
import android.widget.ImageView
import android.widget.Toast
import com.bumptech.glide.Glide

/**
 * Create on 18.7.12 16:57
 * <p>
 * author Zhang Zhixiang
 * <p>
 * Description:
 */

fun Context.toast(msg: String) {
    Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
}

fun ImageView.loadImg(context: Context, url: String) {
    Glide.with(context)
            .load(url)
            .thumbnail(0.1f)
            .into(this)
}