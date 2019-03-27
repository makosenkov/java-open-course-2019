package ru.mail.polis.open.task4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AddTest {

    @Test
    void test() {
        assertEquals(
            3,
            new Add(
                new Const(1),
                new Const(2)
            ).evaluate()
        );
        assertEquals(
            7,
            new Add(
                new Mult(
                    new Const(2),
                    new Const(2)
                ),
                new Const(3)).evaluate()
        );
        assertEquals(
            5,
            new Add(
                new Div(
                    new Const(4),
                    new Const(2)
                ),
                new Const(3)).evaluate()
        );
    }



}