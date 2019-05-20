package com.annarm.kotlin.entity

data class DataEntity constructor(val name:String, val code:Int)

fun main(args: Array<String>) {
    val dataEntity = DataEntity("WANG", 12)
    val (name) = dataEntity
    println("name is $name, code is $")
}