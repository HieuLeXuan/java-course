package test;

import exercise.Exercise16;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Exercise16Test {

    @Test
    void shouldWorkCorrectly() {
        assertTrue(Exercise16.leapYear(2020));
        assertTrue(Exercise16.leapYear(2024));
        assertFalse(Exercise16.leapYear(2021));
        assertTrue(Exercise16.leapYear(2000));
        assertTrue(Exercise16.leapYear(2400));
    }
}
