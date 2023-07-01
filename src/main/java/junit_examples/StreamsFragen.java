package junit;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class StreamsFragen {
    public static void main(String[] args) {
        // Consumer
        Consumer<String> testConsumer = msg -> System.out.println(msg);

        // BiConsumer
        BiConsumer<String, Integer> testBiConsumer = (name, age)
                -> System.out.println(name + " " + age);




    }
}
