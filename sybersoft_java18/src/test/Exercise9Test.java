package test;

import exercise.javacore.Exercise9;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class Exercise9Test {

    @Test
    void shouldWorkCorrectly() {
        assertTrue(Exercise9.compareTwoNum(12, 23));
        assertFalse(Exercise9.compareTwoNum(12, 30));
        assertTrue(Exercise9.compareTwoNum(12, 12));
        assertFalse(Exercise9.compareTwoNum(12, 40));
    }
}
