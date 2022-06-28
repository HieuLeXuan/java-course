package test;

import exercise.CompareTwoNum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class CompareTwoNumTest {

    @Test
    void shouldWorkCorrectly() {
        assertTrue(CompareTwoNum.compareTwoNum(12, 23));
        assertFalse(CompareTwoNum.compareTwoNum(12, 30));
        assertTrue(CompareTwoNum.compareTwoNum(12, 12));
        assertFalse(CompareTwoNum.compareTwoNum(12, 40));
    }
}
