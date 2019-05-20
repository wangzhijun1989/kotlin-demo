package com.annarm.kotlin.condition

/**
 * 条件控制
 */
class Condition{
    fun common(){
//        var max = 0
//        if (a < b) max = b;

        // 使用 else
//        var max: Int
//        if (a > b) {
//            max = a
//        } else {
//            max = b
//        }

        val a = 4
        val b = 8
        val max:Int
        max = if (a>b) a else b
        println("max is " + max)
    }

    /**
     * tong if(a>b) a else b
     */
    fun assignment(){
        val a =2
        val b = 7
        val max = if (a > b) {
            print("Choose a")
            a
        } else {
            print("Choose b")
            b
        }
        println("max is " + max)
    }

    fun testWhen(){
        println("=== test when start ===")
        val x = 1
        val value = when{
            x == 1 -> {
                println("x == 1")
                1 * 10
            }
            x == 2 -> println("x == 2")
            else ->{
                println("x 不是 1 ，也不是 2")
            }
        }
        println("x * 10 = " + value)

        when(x){
            0, 1->{
                println("x is 0 or 1")
            }
            else ->{
                println("x > 1 or x < 0")
            }
        }
        val validNumbers = arrayOf(1,2,3,4,5)
        when(x){
            in validNumbers -> println("x is in validNumbers")
            in 0..10-> {
                println("x is in 0-10")
            }
            !in 10..20 -> {
                println("x is not in 10-20")
            }
            else ->{
                println("x is not in 0-10")
            }
        }

        val items = setOf("apple", "banana", "kiwi")
        when {
            "orange" in items -> println("juicy")
            "apple" in items -> println("apple is fine too")
        }
        println("=== test when end ===")
    }

    fun hasPrefix(x: Any) = when(x) {
        is String -> x.startsWith("prefix")
        else -> false
    }
}

fun main(args: Array<String>) {
    val condition = Condition()
    condition.assignment()
    condition.common()
    condition.testWhen()
    println("hasPrefix by 1 " + condition.hasPrefix("1"))
    println("hasPrefix by prefix " + condition.hasPrefix("prefix"))
}