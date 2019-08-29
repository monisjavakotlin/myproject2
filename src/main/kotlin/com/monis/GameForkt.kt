package com.monis

import java.util.*

fun main() {
    val secret = Random().nextInt(10) + 1
    println(secret)
    val scanner = Scanner(System.`in`)
    for (i in 1..5) {
        println("Pls enter a number(${i}/5): ")
        var number = scanner.nextInt()
        if (number < secret) {
            println("highter")
        } else if (number > secret) {
            println("lower")
        } else {
            println("Yes, the number is:\t" + number)
            break
        }
    }
    println("結束")

}