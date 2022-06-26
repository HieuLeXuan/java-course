package test;

import exercise.SumDigit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumDigitTest {

    @Test
    void shouldWorkCorrectly() {
        assertEquals(-1, SumDigit.sumDigit(-3));
        assertEquals(1, SumDigit.sumDigit(1));
        assertEquals(2, SumDigit.sumDigit(12));
        assertEquals(3, SumDigit.sumDigit(123));
        assertEquals(4, SumDigit.sumDigit(1234));
        assertEquals(5, SumDigit.sumDigit(12345));
    }
}
