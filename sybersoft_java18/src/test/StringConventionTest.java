package test;

import exercise.StringConvention;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringConventionTest {

    @Test
    void shouldWorkCorrectly() {
        assertEquals("Hom Nay Troi Mua", StringConvention.stringConvention("hom nay troi mua"));
        assertEquals("Welcome Java Course", StringConvention.stringConvention("welcome java course"));
        assertEquals("Thank You Very Much", StringConvention.stringConvention("thank you very much"));
    }
}
