package com.kenany.mutationtesting.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public boolean isGreaterThanTen(int num) {
        if (num < 10) {
            return false;
        } else {
            return true;
        }
    }

    public String fizzBuzz(int num) {

        if (num % 15 == 0)
            return "FizzBuzz";
        else if (num % 3 == 0)
            return "Fizz";
        else if (num % 5 == 0)
            return "Buzz";

        return Integer.toString(num);
    }
}
