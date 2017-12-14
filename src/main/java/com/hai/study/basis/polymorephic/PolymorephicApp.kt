package com.hai.study.basis.polymorephic

import com.hai.study.basis.abstract.Human

/**
 * Created by Administrator on 2017/12/4.
 */
fun main(array: Array<String>) {
    var man1 = NormalMan("Jack")
    var man2 = TaiJian("LiLianYing")

//    var mans= listOf<IMan>(man1,man2)
    var mans = listOf<Human>(man1, man2)
    for (man in mans) {
        if (man is IMan) {
            man.action()
        }
        man.eat()
    }
}