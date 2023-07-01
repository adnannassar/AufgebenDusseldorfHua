package junit;

import java.util.Random;

public class RandomGenerator {
    public int generate() {
        return new Random().nextInt(3) + 1;
    }
}
