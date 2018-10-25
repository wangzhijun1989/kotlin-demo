package com.annarm.kotlin.entity

class Greeter(val name:String){

    fun greet(){
        println("Hello, $name")
    }
}

fun main(args: Array<String>) {
    Greeter("LILY").greet()
}