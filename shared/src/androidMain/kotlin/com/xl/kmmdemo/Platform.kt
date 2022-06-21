package com.xl.kmmdemo

import io.ktor.client.*
import io.ktor.client.request.*
import kotlinx.coroutines.*

actual class Platform actual constructor() {
    actual val platform: String = "Android ${android.os.Build.VERSION.SDK_INT}"
    actual fun test(result: (String) -> Unit) {
        GlobalScope.launch {
            val str = HttpClient().get<String>("https://www.wanandroid.com/banner/json")
            result.invoke(str)
        }
    }
}
