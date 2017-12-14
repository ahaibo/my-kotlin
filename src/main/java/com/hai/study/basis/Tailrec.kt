package com.hai.study.basis

/**
 * kotlin 伪递归 tailrec
 * Created by Administrator on 2017/12/4.
 */
fun main(array: Array<String>) {
    var num = 0
    var result = 0
    println("ollAdd(${num}, result): ${ollAdd(num, result)};\tresult: ${result}")
}

fun fact(num: Int): Int {
    if (num == 1) return 1;
    return num * fact(num - 1)
}

/**
 * 伪递归的优化
 * 函数的返回值必须调用函数本身
 */
tailrec fun ollAdd(num: Int, result: Int): Int {
//    println("第${num}次运算，result=${result}")
    if (num == 0) return 1
    else return ollAdd(num - 1, result + num)
}