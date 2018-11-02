package com.annarm.kotlin.commission

import kotlin.properties.Delegates
import kotlin.reflect.KProperty

class Example {
    var p: String by Delegate()
}

// 委托的类
class Delegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "$thisRef, 这里委托了 ${property.name} 属性"
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("$thisRef 的 ${property.name} 属性赋值为 $value")
    }
}

val lazyValue: String by lazy {
    println("computed!")     // 第一次调用输出，第二次调用不执行
    "Hello"
}

class User {
    var name: String by Delegates.observable("初始值") {
        prop, old, new ->
        println("旧值：$old -> 新值：$new")
    }
}

class Site(val map: Map<String, Any?>) {
    val name: String by map
    val url: String  by map
}

fun main(args: Array<String>) {
    val e = Example()
    println(e.p)     // 访问该属性，调用 getValue() 函数

    e.p = "Runoob"   // 调用 setValue() 函数
    println(e.p)

    println(lazyValue)   // 第一次执行，执行两次输出表达式
    println(lazyValue)   // 第二次执行，只输出返回值

    val user = User()
    user.name = "第一次赋值"
    user.name = "第二次赋值"

    val site = Site(mapOf(
            "name" to "菜鸟教程",
            "url"  to "www.runoob.com"
    ))

    // 读取映射值
    println(site.name)
    println(site.url)
}