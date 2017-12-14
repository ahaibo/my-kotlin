package com.hai.study.basis.abstract

/**
 * Created by Administrator on 2017/12/4.
 */
class Man(name: String) : Human(name) {
    override fun eat() {
        println("NormalMan：\t${name} 大口的吃")
    }

    override fun drink() {
        println("NormalMan：\t${name} drink")
    }

    override fun sleep() {
        println("NormalMan：\t${name} sleep")
    }
}