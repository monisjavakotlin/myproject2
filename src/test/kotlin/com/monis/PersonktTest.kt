package com.monis

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class PersonktTest {
    @Test
    fun bmiTest() {
        val human = Human( 66.5f, 1.7f)
        Assertions.assertEquals(66.5f/(1.7f*1.7f),human.bmi())
    }
}