package com.hai.study.basis

/**
 * Created by Administrator on 2017/12/4.
 */
fun main(args: Array<String>) {
    var nums = 1..100
    var step = 5
    var openNums = 1 until 100
    sum(nums, "sumInClosedInterval")
    sumWithStep(nums, step, "sumInClosedIntervalWithStep")

    println()
    sum(openNums, "sumInOpenInterval")
    sumWithStep(openNums, step, "sumInOpenIntervalWithStep")
}

fun sum(nums: IntRange, prefix: String) {
    var result = 0
    for (num in nums) {
        result += num
        print("${num}")
        if (nums.last != num) {
            print(" + ")
        }
    }
    println("\n${prefix}: ${result}")
}

fun sumWithStep(nums: IntRange, step: Int, prefix: String) {
    var result = 0
    var str = ""
    for (num in nums step step) {
        str += "${num} + "
        result += num
    }
    println("${str.substring(0..str.length - 3)}\n${prefix} with step ${step}: ${result}")
}


