package test;

import exercise.Divisor;
import org.junit.jupiter.api.Test;


import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivisorTest {

    @Test
    void shouldWorkCorrectly() {
        assertEquals(Arrays.asList(1, 5), Divisor.divisor(5));
        assertEquals(Arrays.asList(1, 2, 3, 6), Divisor.divisor(6));
        assertEquals(Arrays.asList(1, 3, 9), Divisor.divisor(9));
    }
}
