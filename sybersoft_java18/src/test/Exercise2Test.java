package test;

import exercise.javacore.Exercise2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise2Test {

    @Test
    void shouldWorkCorrectly() {
        assertEquals("100000", Exercise2.convertNumber(32, 2));
        assertEquals("101111", Exercise2.convertNumber(47, 2));
    }
}
