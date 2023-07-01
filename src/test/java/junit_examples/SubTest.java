package junit_examples;

import junit.Sub;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubTest {

    @Test
    void testSubPositiveNumbers() {
        Sub sub = new Sub(10, 2);
        int result = sub.calc();
        assertEquals(result, 8);
    }
    @Test
    void testSubNegativeNumbers1() {
        Sub sub = new Sub(-20, -30);
        int result = sub.calcNegative();
        assertEquals(result, 10);
    }

    @Test
    void testSubNegativeNumbers2() {
        Sub sub = new Sub(10, -30);
        int result = sub.calcNegative();
        assertEquals(result, -1);
    }


}


