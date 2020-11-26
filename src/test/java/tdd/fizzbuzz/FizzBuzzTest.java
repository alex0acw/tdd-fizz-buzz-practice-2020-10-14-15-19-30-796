package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void should_return_normal_number_when_normal_number() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        //given
        int number = 1;
        //when
        String actual = fizzBuzz.countOff(number);
        //then
        assertEquals("1", actual);
    }

    @Test
    void should_return_fizz_when_multiple_of_3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        //given
        int number = 12;
        //when
        String actual = fizzBuzz.countOff(number);
        //then
        assertEquals("Fizz", actual);
    }

    @Test
    void should_return_fizz_when_multiple_of_5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        //given
        int number = 5;
        //when
        String actual = fizzBuzz.countOff(number);
        //then
        assertEquals("Buzz", actual);
    }

    @Test
    void should_return_fizz_when_multiple_of_7() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        //given
        int number = 7;
        //when
        String actual = fizzBuzz.countOff(number);
        //then
        assertEquals("Whizz", actual);
    }

    @Test
    void should_return_fizzbuzz_when_multiple_of_3_and_5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        //given
        int number = 15;
        //when
        String actual = fizzBuzz.countOff(number);
        //then
        assertEquals("FizzBuzz", actual);
    }
}
