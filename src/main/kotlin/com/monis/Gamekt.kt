package com.monis

import java.util.*

fun main() {
    val secret = Random().nextInt(10) + 1
    println(secret)
//    val scaner = Scanner(System.`in`)
    var number = 0
    while (number != secret) {
        print("Pls enter a number : ")
//        number = scaner.nextInt()
        number = readLine()!!.toInt()
        if (number < secret) {
            println("highter")
        }else if (number > secret) {
            println("lower")
        } else {
            println("Great, you got it.")
        }
    }
}