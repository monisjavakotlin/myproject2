package com.monis

import java.util.*

fun main() {
//    userInput()
    val studentkt = Studentkt("monis", 77, 99)
    studentkt.print()
    println("High score: ${studentkt.highest()}")
}

class Studentkt(var name: String, var english: Int, var math: Int) {
    fun print() {
        println(
            name + "\t" + english + "\t" + math + "\t" + getAverage()
                    + if (getAverage() >= 60) "\tPASS" else "\tFAILED"
        )
        /*  if (getAverage() > 60) {
              println("\tPASS")
          } else {
              println("\tFAILED")
          }*/
    }

    fun getAverage(): Int {
        return (english + math) / 2
    }

    fun highest(): Int {
//        var max = if (english > math) english else math
        var max = if (english > math) {
            println("englis")
            english
        } else {
            println("math")
            math
        }
        /*  var max = 0
          if (english > math) {
              max = english
          } else {
              max= math
          }*/
        return max
    }

    fun nameCheck() {
        println(name.length)
    }
}

private fun userInput() {
    val scanner = Scanner(System.`in`)
    print("Please enter sytudent's name:")
    var name = scanner.next()
    print("Please enter sytudent's eglish score:")
    var english = scanner.nextInt()
    print("Please enter sytudent's math score:")
    var math = scanner.nextInt()
    val studentkt = Studentkt(name, english, math)
    studentkt.print()
    studentkt.nameCheck()
}

