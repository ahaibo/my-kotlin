package com.hai.study.basis.polymorephic

import com.hai.study.basis.abstract.Human

/**
 * Created by Administrator on 2017/12/4.
 */
class TaiJian(name: String) : Human(name) {
    override fun eat() {
        println("TaiJian：\t${name} 吃皇上赏我的")
    }

    override fun drink() {
        println("TaiJian：\t${name} 喝皇上赏我的")
    }

    override fun sleep() {
        println("TaiJian：\t${name} sleep")
    }
}