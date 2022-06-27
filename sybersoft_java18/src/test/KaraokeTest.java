package test;

import exercise.Karaoke;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class KaraokeTest {

    @Test
    void shouldWorkCorrectly() {
        assertEquals(-1, Karaoke.TotalMoney("-4:00", "5:00", 2));
        assertEquals(-1, Karaoke.TotalMoney("4:00", "5:00", 2));
        assertEquals(50000, Karaoke.TotalMoney("04:00", "05:00", 2));
        assertEquals(50000, Karaoke.TotalMoney("08:00", "08:59", 2));
    }
}
