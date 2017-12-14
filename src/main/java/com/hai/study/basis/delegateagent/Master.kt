package com.hai.study.basis.delegateagent

/**
 * Created by Administrator on 2017/12/4.
 */
class Master : IWork by Student() {
    override fun cook() {
        println("Master pre cook...")
        Student().cook()
        println("Master watching Student work to cook...")
    }
}