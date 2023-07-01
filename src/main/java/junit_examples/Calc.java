package junit;

import java.util.List;

public class Calc {
    List<Integer> numbers;

    public Calc(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public double average() {
        if (numbers == null || numbers.isEmpty()) {
            return -1;

        } else {
            double sum = 0;
            for (int x : numbers) {
                sum += x;
            }
            return sum / numbers.size();
        }
    }

}
