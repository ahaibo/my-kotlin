package com.hai.study.basis

import org.junit.Test

/**
 * Created by Administrator on 2017/12/4.
 */
class Test {
    fun fact(num: Int): Int {
        if (num == 1) return 1;
        return num * fact(num - 1)
    }

    @Test
    fun testFact() {
        var fact = 20;
        println("factorial ${fact}: ${fact(fact)}")
    }

    @Test
    fun testWhen() {
        var mode = 3
        var msg = ""
        when (mode) {
            0 -> msg = "pre-start"
            1 -> msg = "starting..."
            2 -> msg = "running..."
            3 -> msg = "finished"
            4 -> msg = "close"
            5 -> msg = "exit"
        }
        println("mode: ${mode};\tmsg: ${msg}")
    }
}