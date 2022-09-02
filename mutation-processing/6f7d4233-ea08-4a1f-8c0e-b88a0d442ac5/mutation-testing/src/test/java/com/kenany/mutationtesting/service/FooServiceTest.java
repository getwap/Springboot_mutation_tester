package com.kenany.mutationtesting.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FooServiceTest {

    private FooService service = new FooService();

    @Test
    public void shouldReturn1() {
        Assertions.assertEquals(1, service.foo(true, true));
    }

    @Test
    public void shouldReturnNegate1() {
        Assertions.assertEquals(-1, service.foo(false, false));
    }
}
