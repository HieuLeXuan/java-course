package test;

import exercise.Exercise6;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise6Test {

    @Test
    void shouldWorkCorrectly() {
        assertEquals("cba", Exercise6.reverseString(new StringBuffer("abc")));
        assertEquals("auq ped iort yan moh", Exercise6.reverseString(new StringBuffer("hom nay troi dep qua")));
    }
}
