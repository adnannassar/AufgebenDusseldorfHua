package junit_examples;

import junit.RandomGenerator;
import org.junit.jupiter.api.Test;

public class RandomGeneratorTest {
    @Test
    void testRandomGenerator() {
        RandomGenerator randomGenerator = new RandomGenerator();
        int result = randomGenerator.generate();
    }
}
