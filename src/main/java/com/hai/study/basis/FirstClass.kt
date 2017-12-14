package com.hai.study.basis

/**
 * Created by Administrator on 2017/12/4.
 */
class Rectangle(var width: Int, var height: Int)

class Girl(var character: String, var voice: String) {
    fun smile() {
        println("girl smile, momoda...")
    }

    fun cry() {
        println("girl crying....")
    }
}

fun main(array: Array<String>) {
    var rect = Rectangle(100, 50)
    println("width: ${rect.width};\theight: ${rect.height}")

    var girl = Girl("温柔", "甜美")
    println("girl character is: ${girl.character};\tvoice is: ${girl.voice}")
    girl.smile()
    girl.cry()
}