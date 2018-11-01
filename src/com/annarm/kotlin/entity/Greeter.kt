package com.annarm.kotlin.entity

import com.annarm.kotlin.testA

open class Greeter(private val name:String){

    fun greet(){
        println("Hello, $name")
    }
}

fun main(args: Array<String>) {
    Greeter("LILY").greet()
    testA()
}