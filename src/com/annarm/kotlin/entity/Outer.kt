package com.annarm.kotlin.entity

class Outer {                  // 外部类
    private val bar: Int = 1
    var v = "成员属性"

    class Nested {             // 嵌套类
        fun foo() = 2
        val asg:Int = getBar()
        fun getBar() :Int{
            val barObj = Outer();
            return barObj.bar
        }
    }

    inner class Inner {         //内部类
        fun foo() = bar  // 访问外部类成员
        fun innerTest() {
            var o = this@Outer //获取外部类的成员变量
            println("内部类可以引用外部类的成员，例如：" + o.v)
        }
    }
}

fun main(args: Array<String>) {
    val demo = Outer.Nested().foo() // 调用格式：外部类.嵌套类.嵌套类方法/属性
    println(demo)    // == 2
    println(Outer.Nested().asg)

    val demo1 = Outer().Inner().foo()
    println(demo1) //   1
    Outer().Inner().innerTest() // 内部类可以引用外部类的成员，例如：成员属性
}