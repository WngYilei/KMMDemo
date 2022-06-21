package com.xl.kmmdemo

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }

    fun test(resutl: (String) -> Unit){
        Platform().test(resutl)
    }
}