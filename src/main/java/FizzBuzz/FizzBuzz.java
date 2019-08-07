package FizzBuzz;

public class FizzBuzz {

    private final static String FIZZ = "Fizz";
    private final static String BUZZ = "Buzz";

    public String convert(int number) {
        if(isNumberMultipleOf(number, 15)) return FIZZ + BUZZ;
        if(isNumberMultipleOf(number, 3)) return FIZZ;
        if(isNumberMultipleOf(number, 5)) return BUZZ;

        return String.valueOf(number);
    }

    private boolean isNumberMultipleOf(int dividend, int divider) {
        return dividend % divider == 0;
    }
}
