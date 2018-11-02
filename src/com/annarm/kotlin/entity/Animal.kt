package com.annarm.kotlin.entity

abstract class Animal{
    abstract fun live()
}

abstract class Cat : Animal(){
    override abstract fun live()
}