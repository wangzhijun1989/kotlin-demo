package com.annarm.kotlin.entity

/**
 * 拓展
 */
open class C{
    fun baz() { println("C baz") }

    fun bar() { println("C bar") }


    fun D.f() {
        bar()   // 调用 D.bar
        baz()   // 调用 C.baz
        this@C.bar()
    }

    fun caller(d: D) {
        d.f()   // 调用扩展函数
    }

    companion object{
        val name:String  = "acb"
    }

}

class D(){
    fun bar() { println("D bar") }

}

fun C.foo() = "c"   // 扩展函数 foo

fun D.foo() = "d"   // 扩展函数 foo

fun printFoo(c: C) {
    println(c.foo())  // 类型是 C 类
}

//拓展空对象
fun Any?.toString(): String {
    if (this == null) return "empty null"
    // 空检测之后，“this”会自动转换为非空类型，所以下面的 toString()
    // 解析为 Any 类的成员函数
    return "value: " + toString()
}

fun main(arg:Array<String>){
//    printFoo(D()) 静态解释，D : C()
    var t = null
    println(t.toString())
    val abc = "abc"
    println(abc.toString())
    println("========================")
    val c: C = C()
    val d: D = D()
    c.caller(d)
}