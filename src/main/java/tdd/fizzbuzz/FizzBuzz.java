package tdd.fizzbuzz;

public class FizzBuzz {
    private static final int FIZZ_MULTIPLE = 3;

    public String countOff(int number) {
        if (number % FIZZ_MULTIPLE == 0) return "Fizz";
        return String.valueOf(number);
    }
}
