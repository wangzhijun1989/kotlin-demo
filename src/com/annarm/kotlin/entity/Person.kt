package com.annarm.kotlin.entity

class Person constructor(private var name:String){

    constructor(name: String, sex:Int): this(name){
        this.sex = sex
    }

    fun printName(){
        println(this.name)
    }

    var sex:Int = 1
    set(value) {field = value+1}
    get() {return field+1}

    var address:String = "addr"

    var age:Int = 20
    set(value) {
        field = if (value > 150) 150 else value
    }
    get() {
        return ++field
    }

    lateinit var skill:String

    init {
        println("person init $name")
    }
}