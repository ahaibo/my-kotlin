package com.hai.study.basis.extends

/**
 * Created by Administrator on 2017/12/4.
 */
open class Father {
    var character: String = "性格内向"
    open fun action() {
        println("公共场合喜欢大声喧哗")
    }
}