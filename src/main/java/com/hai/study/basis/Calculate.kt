package com.hai.study.basis

/**
 * Created by Administrator on 2017/12/4.
 */
fun main(array: Array<String>) {
    do {
        println("please input first num: ")
        var first = readLine()
        println("please input last num: ")
        var last = readLine()

        try {

            println("calc: ${first} + ${last} = ${first!!.toInt() + last!!.toInt()}")
        } catch (e: Exception) {
            println("input error: ${e}")
        }

        println("continue?: y/n")
        var iscontinue = readLine() as String
    } while (iscontinue == "y")
}
