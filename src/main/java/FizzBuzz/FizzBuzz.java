package FizzBuzz;

public class FizzBuzz {
    public String convert(int number) {
        String result = String.valueOf(number);
        boolean isNumberMultipleOfThree = isNumberMultipleOf(number, 3);
        boolean isNumberMultipleOfFive = isNumberMultipleOf(number, 5);
        if(isNumberMultipleOfThree) {
            result = "Fizz";
        }
        if(isNumberMultipleOfFive) {
            result = "Buzz";
        }
        if(isNumberMultipleOfThree && isNumberMultipleOfFive) {
            result = "FizzBuzz";
        }
        return result;
    }

    private boolean isNumberMultipleOf(int dividend, int divider) {
        return dividend % divider == 0;
    }
}
