package test;

import exercise.javacore.Exercise7;
import org.junit.jupiter.api.Test;


import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise7Test {

    @Test
    void shouldWorkCorrectly() {
        assertEquals(Arrays.asList(1, 5), Exercise7.divisor(5));
        assertEquals(Arrays.asList(1, 2, 3, 6), Exercise7.divisor(6));
        assertEquals(Arrays.asList(1, 3, 9), Exercise7.divisor(9));
    }
}
