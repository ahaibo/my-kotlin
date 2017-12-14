package com.hai.study.basis.abstract

/**
 * Created by Administrator on 2017/12/4.
 */
fun main(array: Array<String>) {
    var zhangsan = Man("zhangsan")
    var lisi = Man("lisi")
    var lili = Woman("lili")

    var humans = listOf<Human>(zhangsan, lisi, lili)
    for (human in humans) {
        human.action()
    }
}