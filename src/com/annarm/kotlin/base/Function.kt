package com.annarm.kotlin.base

/**
 * 基本语法
 */
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
        val sumLambda:(Int, Int) -> String = {x,y ->"kotlin $x + $y = ".plus(x + y)}
        println(sumLambda(1, 2))
    }

    fun testLambdaPlus(){
        val sumLambda = {x:Int, y:Int -> x+y}
        println(sumLambda(3, 2))
    }

    /**
     * var 可变
     */
    fun testVar(){
        var value :Int = 5;
        value = 8;
        println(value)
    }

    /**
     * val 不可变
     */
    fun testVal(){
        val value :String = "complete";
//        value = "not complete";
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
        println("template function=> ".plus(t))
        t.replace("is", "was")
        val t1 = "${t.replace("is", "was")}, but now is $a"
        println("template function=> ".plus(t1))
    }

    /**
     * 空校验
     */
    fun emptyValid(param:String){
        //类型后面加?表示可为空
        var age: String? = "23"

        //抛出空指针异常
        val ages = param!!.toInt()
        println("empty valid ages=> " + ages)

        //不做处理返回 null
        val ages1 = age?.toInt()
        println("empty valid ages1=> " + ages1)
        println("empty valid isNullOrEmpty=> " + age.isNullOrEmpty())
        println("empty valid isNullOrBlank=> " + age.isNullOrBlank())


        age = null
        //age为空返回-1
        val ages2:Int = age?.toInt()  ?:  -1
        println("empty valid ages2=> " + ages2)


        val a = with("string") {
            println(this)
            3
        }
        println(a)

        var age7:String? = "12"
        var intage = age7?.toInt() ?: 12
    }

    /**
     * 类型转换
     * obj is String
     * obj !is String
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

    fun maxOf(a: Int, b: Int) = if (a > b) {
        println("a > b")
        a
    }  else {
        println("a < b")
        b
    }


}

fun main(args: Array<String>){
    println("main1")
    val function = Function()
    println("a ${function.maxOf(1, 2)} ")
    val map:MutableMap<String, String> = mutableMapOf()

    map["1"] = "a"
    map["2"] = "b"
    map.put("c", "c")
    for (en in map){
        println("key ${en.key} and value is ${en.value}")
    }

    val lambda : (Int, Int)->Int = {
        x, y-> var total = x +y
        total *= 3
        total + 1
    }
    println("lambda ${lambda(1,2)}")

    println("sum function=> 3 + 5 = " + function.sum(3, 5))
    println("sum plus function=> 3 + 6 = " + function.sumPlus(3, 6))
    function.printSum(4, 5)
    function.varTest(1,2,3,4,56,7)
    function.testLambda()
    function.testVar()
    function.template("kotlin")
    function.emptyValid("27")
    println("type function=> "+ function.getStringLength("mark"))
    function.testRange()
    function.testLambdaPlus()
}