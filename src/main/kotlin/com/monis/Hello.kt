package com.monis

fun main() {
//    println("Hello kotlin")
//    Human().hello()
    val human = Human(66.5f, 1.7f)
    human.hello()
    println(human.bmi())

/*    //資料型態都是物件
    val age = 19  //不可變
    val name = "Monis"
    var weight = 66.5 //可變
    var name2: String
    name2 = "monis"*/

}

class Human(var weight: Float, var height: Float, var name: String = "") {
    init {
        println("Test $weight")
    }

//    constructor(name: String, weight: Float, height: Float) : this(weight, height)

    fun bmi(): Float {
        val BMI = weight / (height * height)
        return BMI
    }

    fun hello() {
        println("Hello kotlin")
    }
}

