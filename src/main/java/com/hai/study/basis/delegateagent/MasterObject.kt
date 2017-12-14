package com.hai.study.basis.delegateagent

/**
 * 接口实现的委托：关键字 by
 * Created by Administrator on 2017/12/4.
 */
class MasterObject : IWork by StudentObject {
    override fun cook() {
        println("MasterObject pre cook...")
        StudentObject.cook()
        println("MasterObject watching StudentObject work to cook...")
    }
}