package com.monis;

import com.monis.student.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentTest {
    Student student = new Student("monis", 60, 80);

    @Test
    void hightScoreTest() {
        Assertions.assertEquals(80,student.hightest());
    }

    @Test
    void averageTest() {
        Assertions.assertEquals((60+80)/2,student.getAverage());
    }
}
