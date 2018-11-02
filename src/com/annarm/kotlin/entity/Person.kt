package com.annarm.kotlin.entity

/**
 * 类继承
 */
open class Person constructor(protected var name:String){

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

    open var age:Int = 20
    set(v) {
        field = if (v > 150) 150 else v
    }
    get() {
        return ++field
    }

    lateinit var skill:String

    init {
        println("person init $name")
    }

    open fun job(){
        println("no target")
    }
}

class Student(name : String, age : Int, var no : String, var score : Int) : Person(name){
    override fun job(){
        println("study")
    }
}

class Teacher : Person{

    override var age: Int = 1

    constructor(name:String, age:Int):super(name){
        println("age: " + age)
    }

    override fun job() {
        super.job()
        println("make course")
    }
}

fun Teacher.print(){
    print(age)
}

fun main(args: Array<String>) {
    val teacher:Teacher = Teacher("zz", 299)

    val student:Student = Student("ming", 299, "0221", 87)
    teacher.job();
    println("teacher job end")
    student.job()
    println("student job end")

    teacher.age = 299;
    student.age = 299
    println(student.age)
    println(teacher.age)

    println("拓展")
    teacher.print()
}