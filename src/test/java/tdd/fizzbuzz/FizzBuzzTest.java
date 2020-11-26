package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void should_return_normal_number_when_normal_number() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String actual = fizzBuzz.countOff(1);
        //then
        assertEquals("1", actual);
    }

    @Test
    void should_return_fizz_when_multiple_of_3() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String actual = fizzBuzz.countOff(12);
        //then
        assertEquals("Fizz", actual);
    }

    @Test
    void should_return_fizz_when_multiple_of_5() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String actual = fizzBuzz.countOff(5);
        //then
        assertEquals("Buzz", actual);
    }
    @Test
    void should_return_fizz_when_multiple_of_7() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String actual = fizzBuzz.countOff(7);
        //then
        assertEquals("Whizz", actual);
    }
}
