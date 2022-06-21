package com.xl.kmmdemo.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.xl.kmmdemo.Greeting
import android.widget.TextView
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlin.concurrent.thread

fun greet(): String {
    return Greeting().greeting()
}

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv: Button = findViewById(R.id.text_view)
        tv.text = "获取数据"
        val content: TextView = findViewById(R.id.tv_content)

        tv.setOnClickListener {
            Greeting().test {
                runOnUiThread {
                    content.text = it
                }
            }
        }

    }
}
