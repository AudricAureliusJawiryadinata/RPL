package com.example.demo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SampleTest {

    @Test
    public void testAdd() {
        int result = Sample.add(3, 8);
        Assertions.assertEquals(11, result, "The sum of 3 and 8 should be 11");
    }
}