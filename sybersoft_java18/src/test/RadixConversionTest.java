package test;

import exercise.RadixConversion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadixConversionTest {

    @Test
    void shouldWorkCorrectly() {
        assertEquals("100000", RadixConversion.convertNumber(32, 2));
    }
}
