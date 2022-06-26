package test;

import exercise.ReverseString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseStringTest {

    @Test
    void shouldWorkCorrectly() {
        assertEquals("cba", ReverseString.reverseString(new StringBuffer("abc")));
        assertEquals("auq ped iort yan moh", ReverseString.reverseString(new StringBuffer("hom nay troi dep qua")));
    }
}
