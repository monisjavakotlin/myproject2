package com.monis

import java.util.*

fun main() {
//    userInput()
    Studentkt.pass = 50
    val studentkt = Studentkt("monis", 17, 45)
    studentkt.print()
    val studentkt2 = Studentkt("snow", 60, 56)
    studentkt2.print()
    val studentkt3 = Studentkt("lulu", 88, 67)
    studentkt3.print()
    val gstudentkt = GraduateStudent("max", 55, 65,60)
    gstudentkt.print()
}

class GraduateStudent(name: String, english: Int, math: Int, var thesis: Int) : Studentkt(name, english, math) {
    companion object {
        var pass = 70
    }

    override fun print() {
        println("$name\t$english\t$math\t$thesis\t${getAverage()}\t${passOrFailed()}\t${grading()}")
        println("High score:\t${highest()}")
    }

    override fun passOrFailed() = if (getAverage() >= pass) "PASS" else "FAILED"
}

open class Studentkt(var name: String, var english: Int, var math: Int) {

    companion object {
        @JvmStatic
        var pass = 60

        fun test() {
            println("testing")
        }

    }

    open fun print() {
        println("$name\t$english\t$math\t${getAverage()}\t${passOrFailed()}\t${grading()}")
        println("High score:\t${highest()}")
    }

    open fun passOrFailed() = if (getAverage() >= pass) "PASS" else "FAILED"

    fun grading() = when (getAverage()) {
        in 90..100 -> 'A'
        in 80..89 -> 'B'
        in 70..79 -> 'C'
        in 60..69 -> 'D'
        else -> 'F'
    }

    open fun getAverage() = (english + math) / 2

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

