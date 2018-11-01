package com.annarm.kotlin.base

import java.lang.Integer.parseInt

class Function{
    /**
     * 函数定义使用关键字 fun，参数格式为：参数 : 类型
     */
    fun sum(a:Int, b:Int):Int{
        return a + b
    }

    /**
     * 表达式作为函数体，返回类型自动推断：
     */
    fun sumPlus(a:Int, b: Int) = a + b

    /**
     *  public 方法则必须明确写出返回类型
     */
    public fun sumPlusPublic(a: Int, b: Int):Int = a + b

    /**
     * void 返回
     * 如果是返回 Unit类型，则可以省略(对于public方法也是这样)：
     */
    fun printSum(a: Int, b: Int){
        println("$a + $b = ".plus(a + b));
    }

    /**
     * vararg
     */
    fun varTest(vararg v:Int){
        for (vt in v){
            println(vt)
        }
    }

    /**
     * lambda
     */
    fun testLambda() {
        val sumLambda:(Int, Int) -> Int = {x,y ->x+y}
        println(sumLambda(1, 2))
    }

    /**
     * var 可变
     */
    fun testVar(){
        var value :Int = 5;
        println(value)
    }

    /**
     * val 不可变
     */
    fun testVal(){
        val value :String = "complete";
        println(value)
    }

    /**
     * 字符串模板
     * $ 表示一个变量名或者变量值
     * $varName 表示变量值
     * ${varName.fun()} 表示变量的方法返回值:
     */
    fun template(a: String){
        val t = "a value is $a"
        println("template function=> " + t)

        val t1 = "${t.replace("is", "was")}, but now is $a"
        println("template function=> " + t1)
    }

    /**
     * 空校验
     */
    fun emptyValid(param:String?){
        //类型后面加?表示可为空
        var age: String? = "23"
        //抛出空指针异常
        val ages = param!!.toInt()
        println("empty valid ages=> " + ages)

        //不做处理返回 null
        val ages1 = age?.toInt()
        println("empty valid ages1=> " + ages1)

        age = null
        //age为空返回-1
        val ages2 = age?.toInt() ?: -1
        println("empty valid ages2=> " + ages2)
    }

    /**
     * 类型转换
     */
    fun getStringLength(obj: Any): Int? {
        // 在 `&&` 运算符的右侧, `obj` 的类型会被自动转换为 `String`
        if (obj is String && obj.length > 0)
            return obj.length
        return null
    }

    /**
     * 区间
     */
    fun testRange(){
        for (i in 1..4){
            println("per item value is " + i);
        }
        println("=============================")
        for (i in 4..1){
            println("per item value is " + i);
        }
        println("=============================")

        for (i in 1..4 step 2){
            println("per item value step 2 is " + i)
        }
        println("=============================")

        for (i in 4 downTo 1 step 2){
            println("per item down to value is " + i)
        }
        println("=============================")

        for (i in 1 until 3){
            println("per item until value is " + i)

        }
    }
}