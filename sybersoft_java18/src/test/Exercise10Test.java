package test;

import exercise.javacore.Exercise10;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise10Test {

    @Test
    void shouldWorkCorrectly() {
        assertEquals(5, Exercise10.sumLeaf(3));
        assertEquals(77, Exercise10.sumLeaf(20));
        assertEquals(1060, Exercise10.sumLeaf(100));
        assertEquals(17, Exercise10.sumLeaf(9));
    }
}
