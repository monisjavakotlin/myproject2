package com.monis

fun main() {
//    println("Hello kotlin")
//    Human().hello()
    val human = Human()
    human.hello()
    //資料型態都是物件
    val age = 19  //不可變
    val name = "Monis"
    var weight = 66.5 //可變
    var name2: String
    name2 = "monis"


}

class Human() {
    fun hello() {
        println("Hello kotlin")
    }
}

