package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void should_return_normal_number_when_normal_number() {
        //
        FizzBuzz fizzBuzz = new FizzBuzz();
        //
        String actual = fizzBuzz.countOff(1);
        //
        assertEquals("1", actual);
    }
}
