package test;

import exercise.Distance;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DistanceTest {

    @Test
    void shouldWorkCorrectly() {
        assertEquals(6.409999847412109, Distance.distance(0, 1, 4, 6));
    }
}
