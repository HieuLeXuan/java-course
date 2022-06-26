package test;

import exercise.Karaoke;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KaraokeTest {

    @Test
    void shouldWorkCorrectly() {
        assertEquals(50000, Karaoke.TotalMoney(2));
    }
}
