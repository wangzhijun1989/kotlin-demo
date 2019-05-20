package com.annarm.kotlin.generic

/**
 * 泛型
 */
class Item{
    fun job(){
        print("JOB")
    }
}

class Box<T>(val value:T){
//    var value = t
}

// 定义一个支持协变的类
class RunoobOut<out A>(val a: A) {
    fun foo(): A {
        return a
    }
}
// 定义一个支持逆变的类
class RunoobIn<in A> {
    fun foo(a: A) {
        println(a)
    }
}

class A<T>(val t: T, val t2 : T, val t3 : T)
class Apple(var name : String)

fun main(args: Array<String>) {
    val box1 = Box<Int>(1)
    val box2 = Box<String>("string")
    println(box1.value)
    println(box2.value)
//    box.job()
    val box3 = boxIn("abc")
    val box4 = boxIn(false)
    println(box3.value)
    println(box4.value)

    println("============协变开始============")
    val strCo: RunoobOut<String> = RunoobOut("producer")
    var anyCo: RunoobOut<Any> = RunoobOut<Any>("b")
    anyCo = strCo
//    strCo = anyCo
    println(anyCo.foo())   // 输出 a
    println("============协变结束============\n")
    println("============逆变开始============")
    var strInCo:RunoobIn<String> = RunoobIn<String>()
    val anyInCo:RunoobIn<Any> = RunoobIn<Any>()
    strInCo = anyInCo
    strInCo.foo(Any())
    println("============逆变结束============\n")


    val a1: A<*> = A(12, "String", Apple("苹果"))
    val a2: A<Any?> = A(12, "String", Apple("苹果"))   //和a1是一样的
    val apple = a1.t3    //参数类型为Any
    println(apple)
    val apple2 = apple as Apple   //强转成Apple类
    println(apple2.name)
    //使用数组
    val l:ArrayList<*> = arrayListOf("String",1,1.2f,Apple("苹果"))
    for (item in l){
        println(item)
    }

}

fun <T> boxIn(value: T) = Box(value)


