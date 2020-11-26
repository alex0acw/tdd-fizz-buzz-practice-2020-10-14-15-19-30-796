package tdd.fizzbuzz;

public class FizzBuzz {
    private static final int FIZZ_MULTIPLE = 3;
    private static final int BUZZ_MULTIPLE = 5;
    private static final int WHIZZ_MULTIPLE = 7;

    public String countOff(int number) {
        StringBuilder result = new StringBuilder();
        if (number % FIZZ_MULTIPLE == 0) result.append("Fizz");
        if (number % BUZZ_MULTIPLE == 0) result.append("Buzz");
        if (number % WHIZZ_MULTIPLE == 0) result.append("Whizz");
        if (!result.isEmpty())
            return result.toString();
        else
            return String.valueOf(number);
    }
}
