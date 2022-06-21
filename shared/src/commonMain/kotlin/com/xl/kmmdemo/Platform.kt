package com.xl.kmmdemo

expect class Platform() {
    val platform: String
    fun test(result: (String) -> Unit)
}
