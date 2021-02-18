package com.frankhacks;

import org.junit.jupiter.api.Test;

public class Excercise23Test {
    Function<Integer, Function<Integer, Integer>> addTwoNumbers = a -> b -> a + b;

    BinaryOperator addInheritance = a -> b -> a + b;


    @Test
    void test() {
        System.out.println(addTwoNumbers.apply(1).apply(2));
    }

    @Test
    void testInheritance() {
        System.out.println(addInheritance.apply(1).apply(2));
    }

private interface BinaryOperator extends
        Function<Integer, Function<Integer, Integer>> {}
}

