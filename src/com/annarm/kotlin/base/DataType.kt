package com.annarm.kotlin.base

/**
 * 数据类型
 */
class DataType{
    /**
     * 三个等号 === 表示比较对象地址，两个 == 表示比较两个值大小
     */
    fun compare(){
        val a = "100"
        val b:String = (20 * 5).toString()
        println(a == b)
        println(a === b)
    }

    /**
     * 在不进行显式转换的情况下我们不能把 Byte 型值赋给一个 Int 变量
     */
    fun conversion(){
//        val b:Byte = 1
//        val i:Int = b //wrong
        val b:Byte = 1
        val i:Int = b.toInt()
        println(i)
    }

    /**
     * char 必须单引号
     */
    fun testChar(c : Char){
        if (c == 'k'){
            println("received k")
        }
    }

    /**
     * 数组
     */
    fun testArray(){
        val a = arrayOf(1,2,3,4)
        println(a.size)
        println(a[2])
        val b = Array(5, {i -> (i*3) })
        for (i in b) {
            println(i)
        }
        val x = intArrayOf(1,2,3)
    }

    /**
     * 测试字符串
     */
    fun testString(str:String){
        println("=========testString==========")
        for (c in str){
            println(c)
        }

        val text = """
    多行字符串
    多行字符串
    """
        println(text)   // 输出有一些前置空格
        val margin = "             kotlin hello".trimMargin()
        println(margin)
    }

    /**
     *
     */
    fun testTemplate(){
        val i = 10;
        val s = "i = $i"
        println(s)
        val sPlus = "$s is ${s.length}"

        println(sPlus)

        val price = """
    ${'$'}9.99
    """
        println(price)  // 求值结果为 $9.99
    }
}