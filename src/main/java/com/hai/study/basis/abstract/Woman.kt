package com.hai.study.basis.abstract

/**
 * Created by Administrator on 2017/12/4.
 */
class Woman(name: String) : Human(name) {

    override fun eat() {
        println("Woman：\t${name} 细嚼慢咽的吃")
    }

    override fun drink() {
        println("Woman：\t${name} drink") //To change body of created functions use File | Settings | File Templates.
    }

    override fun sleep() {
        println("Woman：\t${name} sleep") //To change body of created functions use File | Settings | File Templates.
    }
}