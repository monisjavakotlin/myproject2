package com.monis

fun main() {
    val list = listOf(4, 5, 7, 1, 8)
    println(list)
    println(list.get(3))

    val scores = listOf(46, 87, 23, 57, 92)
    println(scores)
    for (score in scores) {
        println(score)
    }

    var mutableList = mutableListOf(4, 7, 2, 9)
    mutableList.add(6)
    println(mutableList)

}