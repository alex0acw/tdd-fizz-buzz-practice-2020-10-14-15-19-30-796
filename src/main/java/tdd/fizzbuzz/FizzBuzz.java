package tdd.fizzbuzz;

public class FizzBuzz {
    private static final int FIZZ_MULTIPLE = 3;
    private static final int BUZZ_MULTIPLE = 5;
    private static final int WHIZZ_MULTIPLE = 7;

    public String countOff(int number) {
        if (number % FIZZ_MULTIPLE == 0) return "Fizz";
        if (number % BUZZ_MULTIPLE == 0) return "Buzz";
        if (number % WHIZZ_MULTIPLE == 0) return "Whizz";
        return String.valueOf(number);
    }
}
