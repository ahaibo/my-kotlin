package com.hai.study.basis.delegateagent

/**
 * 定义为 object 的对象，在 jvm 内只有一份
 * Created by Administrator on 2017/12/4.
 */
object StudentObject : IWork {
    override fun cook() {
        println("StudentObject hard to work..")
    }
}