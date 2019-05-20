package com.annarm.kotlin

import com.annarm.kotlin.base.DataType
import com.annarm.kotlin.base.Function
import com.annarm.kotlin.cycle.Cycle
import com.annarm.kotlin.entity.Person
import com.annarm.kotlin.entity.Teacher
import com.annarm.kotlin.generic.boxIn

fun main(args: Array<String>) {
    val testFunImport = boxIn(100)
    println(testFunImport.value)

    testObject()
}

fun testObject(){
    val site = object {
        val name = "baidu"
        val url = "http://www.baidu.com"
        fun printDetail(){
            println("${this} name is $name, url is $url")
        }
    }
    println(site.name)
    println(site.url)
    //com.annarm.kotlin.MainKt$testObject$site$1@7440e464
    site.printDetail()

    //class object 可以随意在文件中定义，完整包名跟路径名一致
    SiteObject.printDetail()
    val c = C()
    println(c)
    c.bar()
}

object SiteObject{
    private const val name = "baidu"
    private const val url = "http://www.baidu.com"
    fun printDetail(){
        println("${this} name is $name, url is $url")
    }
}

fun testA(){
    println("testA")
}

class C {
    // 私有函数，所以其返回类型是匿名对象类型
    private fun foo() = object {
        val x: String = "x"
    }

    // 公有函数，所以其返回类型是 Any
    fun publicFoo() = object {
        val x: String = "x"
    }

    fun bar() {
        val obj = foo()
        println(obj)
        val x1 = foo().x        // 没问题
//        val x2 = publicFoo().x  // 错误：未能解析的引用“x”
    }
}
