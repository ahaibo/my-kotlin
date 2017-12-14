package com.hai.study.basis.extends

/**
 * Created by Administrator on 2017/12/4.
 */
class Son : Father() {
    fun say() {
        println("hello")
    }

    override fun action() {
        println("diathesis...")
    }
}