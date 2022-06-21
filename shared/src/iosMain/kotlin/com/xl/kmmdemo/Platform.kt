package com.xl.kmmdemo

import io.ktor.client.*
import io.ktor.client.request.*
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
actual class Platform actual constructor() {
    actual val platform: String = "hello ios"
    actual fun test(result: (String) -> Unit) {
        println("test ios")
        GlobalScope.launch {
            val str = HttpClient().get<String>("https://www.wanandroid.com/banner/json")
            result.invoke(str)
        }
    }
}