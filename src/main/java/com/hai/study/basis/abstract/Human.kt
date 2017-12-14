package com.hai.study.basis.abstract

/**
 * Created by Administrator on 2017/12/4.
 */
abstract class Human(var name: String) {
    abstract fun eat()
    abstract fun drink()
    abstract fun sleep()
    fun action() {
        eat()
        drink()
        sleep()
        println()
    }
}