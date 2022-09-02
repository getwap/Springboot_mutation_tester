package com.kenany.mutationtesting.service;

public class FooService {

    public int foo(boolean a, boolean b) {
        int i = 0;

        if (a && b) {
            i++;
        } else if (! (a && b)) {
            i--;
        }

        return i;
    }

}
