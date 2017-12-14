package com.hai.study.basis.delegateagent

/**
 * Created by Administrator on 2017/12/4.
 */
fun main(array: Array<String>) {
//    testMaster()
    testMasterObject()
}

fun testMaster() {
    var master = Master()
    var master2 = Master()
    println(master == master2)
    master.cook()
}

fun testMasterObject() {
    var student = StudentObject
    var student2 = StudentObject
    println(student == student2)

    var master = MasterObject()

    student.cook()
    master.cook()
}