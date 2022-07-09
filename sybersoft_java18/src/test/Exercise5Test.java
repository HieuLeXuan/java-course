package test;

import exercise.javacore.Exercise5;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise5Test {

    @Test
    void shouldWorkCorrectly() {
        assertEquals(6.40, Exercise5.distance(0, 1, 4, 6));
    }
}
