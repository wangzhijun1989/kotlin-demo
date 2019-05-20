package com.annarm.kotlin

fun main(args: Array<String>) {
//    println("Hello kotlin");
//    val student = Student()
//    System.out.println(student.name)

    val l:ArrayList<*> = arrayListOf("",1,2,3)
//    l.add("1")
    println(l[2])
}

class Student {
    lateinit var name: String

    init {
        println("zzaa")
    }

    init {
        name = "zhangsan"
        println("student init , name is $name")
    }

    init {
        println("student init")
    }

    init {
        println("dsb1")
    }

    constructor() {
        println("constructor")
    }

    constructor(name: String) {
        println("constructor(name)")
    }
}