# KMMDemo
## 前言

这是本人探究KMM跨平台项目练手的一个项目，只是简单实现了一下跨平台接口的访问请求。

## 浅尝

先简单说下环境

- xcode:12.3

- kotlin:1.5.31

- ktor:1.6.5

- Kotlin Multiplatform Mobile 0.3.2

  

这里先说下本人遇到的坑:

1.当kotlin 使用1.6版本及以上版本的时候 就会需要更高版本的xcode，我的macos是10.15.7 的，最多使用12.3版本的xcode。

2.ktor 1.6.8 以上就需要使用kotlin1.6的环境的，所以ktor我这边选择的较低的1.6.5版本 

3.ktor-ios 的1.6.5版本是没有的，这里我是自己下载源码进行编译了一下，然后上传到自己的私仓进行使用的。

4.在这期间遇到了这个问题：

```java
There is no event loop. Use runBlocking { ... } to start one.
```

这个问题主要是没使用kotlin-native 的协程

加入这个就解决了 

```groovy
implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.4.3-native-mt")
```

遇到最多的坑就是环境方面的了，前期一顿配置。

创建项目是使用的是Kotlin Multiplatform Mobile （KMM） 插件。



然后说下代码方面:

      ├─ androidApp
      ├─ iosApp
      ├─ shared
          ├─ androidMain
          ├─ iosMain
          ├─ common    

整个项目结构是这样的。

androidApp就是运行在安卓平台上的。

iosApp 就是运行在ios平台上的。

shared就是两者通用的部分。

shared中，由common中进行接口定义，然后由androidMain和iosMain分别对各自的平台进行实现，然后在common中定义 使用方法，供双方进行调用。



接下来看下效果：



![QQ20220621-120835-HD](https://tva1.sinaimg.cn/large/e6c9d24ely1h3fqtz5bobg207u0goqv6.gif)![ios](https://tva1.sinaimg.cn/large/e6c9d24ely1h3fqu89trkg20800gn7wj.gif)




参考项目：
1.https://github.com/Kotlin/kmm-production-sample.git
2.https://github.com/icerockdev/moko-template.git


