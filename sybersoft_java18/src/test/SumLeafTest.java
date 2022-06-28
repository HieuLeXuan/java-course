package test;

import exercise.SumLeaf;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumLeafTest {

    @Test
    void shouldWorkCorrectly() {
        assertEquals(5, SumLeaf.sumLeaf(3));
        assertEquals(77, SumLeaf.sumLeaf(20));
        assertEquals(1060, SumLeaf.sumLeaf(100));
        assertEquals(17, SumLeaf.sumLeaf(9));
    }
}
