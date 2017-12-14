package com.hai.study.basis.polymorephic

import com.hai.study.basis.abstract.Human

/**
 * Created by Administrator on 2017/12/4.
 */
class NormalMan(name: String) : Human(name), IMan {
    override fun eat() {
        println("NormalMan：\t${name} 大口的吃")
    }

    override fun drink() {
        println("NormalMan：\t${name} drink")
    }

    override fun sleep() {
        println("NormalMan：\t${name} sleep")
    }

    override fun live() {
        println("man to live...")
    }
}