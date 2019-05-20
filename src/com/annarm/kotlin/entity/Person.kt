package com.annarm.kotlin.entity

/**
 * 类继承
 */
open class Person constructor(open protected var name:String){

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
    /**
     * 可为空的变量需添加？
     */
    var hair:String? = null
    /**
     * 不带？则是不可空变量
     */
//    var hair1:String = null
    /**
     * lateinit延长初始化
     */
    lateinit var hair3:String

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
//    override var name:String = "teacher override"

    var temp :Int? = null
        get() = 10
    constructor(name:String, age:Int):super(name){
        println("age: " + age)
    }
    constructor(abc:Int):super("",abc){

    }
    override fun job() {
        super.job()
        println("make course")
    }
}

fun Teacher.print(){
    println("teacher expand $age is ".plus(age))
}

fun main(args: Array<String>) {
    val teacher:Teacher = Teacher("zz", 299)

    val student:Student = Student("ming", 299, "0221", 87)
    teacher.job();
    println("teacher job end")
    student.job()
    println("student job end")

    teacher.age = 299
    student.age = 29
    println(student.age)
    println(teacher.age)
    println("teacher temp is ${teacher.temp}")

    println("拓展")
    teacher.print()
    Teacher("aa", 12).printName()

    Person("24c").printName()


    val person = Person("David")
    person.address = "sh=y"
    println(person.address)
    person.sex = 5
    println(person.sex)
    person.age = 166
    println(person.age)

    val personLi = Person("Li", 30)
    println(personLi.age)

//    val student = Student("student", 12)
    val teacher2 = Teacher("eng", 28)
}