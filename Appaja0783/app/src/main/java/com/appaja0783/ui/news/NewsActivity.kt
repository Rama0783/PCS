package com.appaja0783.ui.news

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.appaja0783.R

class NewsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)
    }

    companion object {
        const val OPEN_NEWS = "open_news"
    }
}