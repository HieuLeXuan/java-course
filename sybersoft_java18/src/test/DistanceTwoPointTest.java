package test;

import exercise.DistanceTwoPoint;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DistanceTwoPointTest {

    @Test
    void shouldWorkCorrectly() {
        assertEquals(6.40, DistanceTwoPoint.distance(0, 1, 4, 6));
    }
}
