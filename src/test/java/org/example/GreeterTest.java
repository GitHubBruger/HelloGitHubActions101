package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GreeterTest {
    private Greeter greeter;

    @BeforeEach
    void setUp() {
        greeter = new Greeter();
    }

    @AfterEach
    void tearDown() {
        greeter = null;
    }

    @Test
    void greetWithName() {
        String name = "Joe";
        String expected = "Hello, Joe!";
        String actual = greeter.greet(name);
        assert(expected.equals(actual));
    }
}