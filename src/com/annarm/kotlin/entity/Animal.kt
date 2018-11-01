package com.annarm.kotlin.entity

open class Animal{
    open fun live(){}
}

abstract class Cat : Animal(){
    override abstract fun live()
}