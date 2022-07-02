package test;

import exercise.Exercise8;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise8Test {

    @Test
    void shouldWorkCorrectly() {
        assertEquals("Hom Nay Troi Mua", Exercise8.stringConvention("hom nay troi mua"));
        assertEquals("Welcome Java Course", Exercise8.stringConvention("welcome java course"));
        assertEquals("Thank You Very Much", Exercise8.stringConvention("thank you very much"));
    }
}
