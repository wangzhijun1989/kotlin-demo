package com.annarm.kotlin

import com.annarm.kotlin.base.DataType
import com.annarm.kotlin.base.Function
import com.annarm.kotlin.cycle.Cycle
import com.annarm.kotlin.entity.Person
import java.util.concurrent.locks.Condition

fun main(args: Array<String>) {
//    testBaseFunction()
//    testDataType()
//    testCondition()
//    testCycle()
//    testEntity();
    testObject()
}

/**
 * 测试基本用法
 */
fun testBaseFunction() {
    val f = Function()
    println("sum function=> 3 + 5 = " + f.sum(3, 5))
    println("sum plus function=> 3 + 6 = " + f.sumPlus(3, 6))
    f.printSum(4, 5)
    f.varTest(1,2,3,4,56,7)
    f.testLambda()
    f.testVar()
    f.template("kotlin")
    f.emptyValid("27")
    println("type function=> "+ f.getStringLength("mark"))
    f.testRange()
}

fun testDataType(){
    val dataType = DataType()
    dataType.compare()
    dataType.testArray()
    dataType.testString("kotlin")
    dataType.testTemplate()
}

fun testCondition(){
    val condition = com.annarm.kotlin.condition.Condition()
    condition.common()
    condition.assignment()
    condition.testWhen()
    println("hasPrefix by 1 " + condition.hasPrefix("1"))
    println("hasPrefix by prefix " + condition.hasPrefix("prefix"))
}

fun testCycle(){
    val cycle = Cycle()
    cycle.common()
    cycle.testOver()
    cycle.testReturn()
}

fun testEntity(){
    val person = Person("David")
    person.address = "sh=y"
    println(person.address)
    person.sex = 5
    println(person.sex)
    person.age = 166
    println(person.age)

    val personLi = Person("Li", 30)
    println(personLi.age)

}


fun testObject(){
    val site = object {
        val name = "baidu"
        val url = "http://www.baidu.com"
    }
    println(site.name)
    println(site.url)
}

fun testA(){
    println("testA")
}

class C {
    // 私有函数，所以其返回类型是匿名对象类型
    private fun foo() = object {
        val x: String = "x"
    }

    // 公有函数，所以其返回类型是 Any
    fun publicFoo() = object {
        val x: String = "x"
    }

    fun bar() {
        val x1 = foo().x        // 没问题
//        val x2 = publicFoo().x  // 错误：未能解析的引用“x”
    }
}
