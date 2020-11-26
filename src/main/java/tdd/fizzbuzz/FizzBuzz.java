package tdd.fizzbuzz;

public class FizzBuzz {
    private static final int FIZZ_MULTIPLE = 3;
    private static final int BUZZ_MULTIPLE = 5;

    public String countOff(int number) {
        if (number % FIZZ_MULTIPLE == 0) return "Fizz";
        if (number % BUZZ_MULTIPLE == 0) return "Buzz";
        return String.valueOf(number);
    }
}
