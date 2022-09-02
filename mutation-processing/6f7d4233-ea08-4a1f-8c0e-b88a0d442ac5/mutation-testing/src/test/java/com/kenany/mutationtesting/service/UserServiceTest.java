package com.kenany.mutationtesting.service;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserServiceTest {

    private UserService userService = new UserService();

    @Test
    void isGreaterThanTen() {
        boolean yes = userService.isGreaterThanTen(12);
        Assertions.assertTrue(yes, "Twelve is greater than 10");
    }

    @Test
    void isGreaterThanTenFalse() {
        boolean no = userService.isGreaterThanTen(9);
        Assertions.assertFalse(no,"Nine is not greater than 10");
    }

    @Test
    public void shouldReturnFizzIfDivisibleBy3() {
        userService.fizzBuzz(3);
        Assertions.assertTrue(true);
    }

    @Test
    public void shouldReturnBuzzIfDivisibleBy5() {
        String result = userService.fizzBuzz(5);
    }

    @Test
    public void shouldReturnFizzBuzzIfDivisibleBy15() {
        Assertions.assertEquals("FizzBuzz", userService.fizzBuzz(15));
        Assertions.assertEquals("FizzBuzz", userService.fizzBuzz(30));
    }

    @Test
    public void shouldReturnTheNumberAsString() {
        Assertions.assertEquals(userService.fizzBuzz(1).getClass(), String.class);
    }
}