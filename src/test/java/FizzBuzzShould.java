import FizzBuzz.FizzBuzz;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.List;

import static java.util.Arrays.*;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class FizzBuzzShould {

    private final int number;
    private final String result;

    FizzBuzz fizzBuzz = new FizzBuzz();

    public FizzBuzzShould(int number, String result) {
        this.number = number;
        this.result = result;
    }

    @Parameters
    public static List<Object[]> data() {
        return asList(new Object[][]{
                {1, "1"},
                {2, "2"},
                {4, "4"},
                {3, "Fizz"},
                {9, "Fizz"},
                {5, "Buzz"},
                {10, "Buzz"},
                {15, "FizzBuzz"}
        });
    }

    @Test
    public void convert() {
        String result = fizzBuzz.convert(number);
        assertEquals(this.result, result);
    }

}
