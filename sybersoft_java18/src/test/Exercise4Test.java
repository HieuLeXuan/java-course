package test;

import exercise.Exercise4;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise4Test {

    @Test
    void shouldWorkCorrectly() {
        assertEquals(-1, Exercise4.sumDigit(-3));
        assertEquals(1, Exercise4.sumDigit(1));
        assertEquals(2, Exercise4.sumDigit(12));
        assertEquals(3, Exercise4.sumDigit(123));
        assertEquals(4, Exercise4.sumDigit(1234));
        assertEquals(5, Exercise4.sumDigit(12345));
    }
}
