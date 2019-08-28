package com.monis

import java.util.*

fun main() {
//    userInput()
    val studentkt = Studentkt("monis", 87, 99)
    studentkt.print()
    println("High score: ${studentkt.highest()}")
}

class Studentkt(var name: String, var english: Int, var math: Int) {
    fun print() {
        println("$name\t$english\t$math\t${getAverage()}\t${passOrFailed()}\t${grading()}")
    }

    fun passOrFailed() = if (getAverage() >= 60) "PASS" else "FAILED"

    fun grading() = when (getAverage()) {
        in 90..100 -> 'A'
        in 80..89 -> 'B'
        in 70..79 -> 'C'
        in 60..69 -> 'D'
        else -> 'F'
    }

    fun getAverage() = (english + math) / 2

    fun highest() = if (english > math) {
        println("englis")
        english
    } else {
        println("math")
        math
    }

    fun nameCheck() = println(name.length)
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

