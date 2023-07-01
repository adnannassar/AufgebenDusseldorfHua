package junit_examples;

import junit.Calc;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.within;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CalcTest {

    @Test
    void testCalcAverageOfNumbers() {
        List<Integer> numbers = List.of(1, 4, 2, 4);
        Calc calc = new Calc(numbers);
        double result = calc.average();
        assertThat(result).isCloseTo(2.75,within(0.01));
    }
}
