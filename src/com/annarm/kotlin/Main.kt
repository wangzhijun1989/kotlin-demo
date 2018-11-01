package com.annarm.kotlin

import com.annarm.kotlin.base.Function

fun main(args: Array<String>) {
    testBaseFunction();
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

fun testA(){
    println("testA")
}
