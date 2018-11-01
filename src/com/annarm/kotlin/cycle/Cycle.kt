package com.annarm.kotlin.cycle

/**
 * 循环控制
 */
class Cycle{
    fun common(){
        val arr = arrayOf(1,4,6)
        arr.indices
        for (i in arr){
            print(i)
        }
        for (i in arr.indices){
            print(arr[i])
        }

        for ((index, value) in arr.withIndex()) {
            println("the element at $index is $value")
        }

        val items = listOf("apple", "banana", "kiwi")
        for (item in items) {
            println(item)
        }

        for (index in items.indices) {
            println("item at $index is ${items[index]}")
        }
    }

    fun testOver(){
        for (i in 1..10) {
            if (i==3) continue  // i 为 3 时跳过当前循环，继续下一次循环
            println(i)
            if (i>5) break   // i 为 6 时 跳出循环
        }

        for (i in 1 until 10){
            print(i)
        }

        println("======")
        loop@ for (i in 1..10) {
            println("i = $i")
            for (j in 1..10) {
                println("j = $j")
                if (j == 3) break@loop
            }
        }
        println("======")
    }

    fun testReturn(){
        val arr = listOf("b", "c", "f")
        arr.forEach { v-> println(v) }
//        arr.forEach {
//            if (it == "b"){
//                print("bbb")
//                return
//            }
//        }

        arr.forEach lit@ {
            if (it == "b"){
                println("bbb")
                return@lit
            }
            println(it)
        }

        println("===============")
        arr.forEach {
            if (it == "b") return@forEach
            println(it)
        }
        println("===============")
        arr.forEach(fun(value: String) {
            if (value == "c") return
            println(value)
        })

        println("testReturn function end")
    }

}