package com.annarm.kotlin.entity

class Greeter(val name:String){
    fun greet(){
        println("Hello, $name")
    }

    fun sum(a:Int, b:Int):Unit{
        a+b;
    }

    fun sumAB(a:Int, b:Int):Int{
        return a + b
    }

    fun vars(vararg v:Int){
        for (arg in v) {
            print(arg)
            print(" ")
        }
    }

    fun foo(arg1:String = "Hello Kotlin", arg2:Boolean, arg3:Int){
        println("arg1=" + arg1 + "&arg2=" + arg2 + "arg3=" + arg3)
    }

    fun printFoo(){
        foo(arg2 = true, arg3 = 7)
    }
}