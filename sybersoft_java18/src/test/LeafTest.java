package test;

import exercise.Leap;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LeafTest {

    @Test
    void shouldWorkCorrectly() {
        assertTrue(Leap.leapYear(2020));
        assertTrue(Leap.leapYear(2024));
        assertFalse(Leap.leapYear(2021));
        assertTrue(Leap.leapYear(2000));
        assertTrue(Leap.leapYear(2400));
    }
}
