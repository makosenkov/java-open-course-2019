package ru.mail.polis.open.task4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConstTest {

    @Test
    void test() {
        assertEquals(
            5,
            new Const(
                5
            ).evaluate()
        );
        assertEquals(
            -1,
            new Const(
                -1
            ).evaluate()
        );
        assertEquals(
            0,
            new Const(
                0
            ).evaluate()
        );
    }

}