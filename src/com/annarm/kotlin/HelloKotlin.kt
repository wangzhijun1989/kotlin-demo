package com.annarm.kotlin

import com.annarm.kotlin.entity.Greeter

fun main(args: Array<String>) {    // 包级可见的函数，接受一个字符串数组作为参数
    println("Hello kotlin!")         // 分号可以省略
    Greeter("ketty!").greet()
    Greeter("ketty!").vars(1,23,45,6)

    println("")
    println("----------")
    val lambda:(Int, Int) -> Int = {x, y -> x + y}
    println("lambda: " + lambda(1, 2))


    Greeter("Ketty!").printFoo()
}