package com.frankhacks;

import org.junit.jupiter.api.Test;

public class Excercise24Test {
    Function<Integer, Integer> triple = x -> x * 3;
    Function<Integer, Integer> square = x -> x * x;

    Function<Function<Integer, Integer>, Function<Function<Integer, Integer>, Function<Integer, Integer>>> compose =
            f1 -> f2 -> arg -> f1.apply(f2.apply(arg));

    Composer composeAbstract = f1 -> f2 -> arg -> f1.apply(f2.apply(arg));

    private interface Composer extends
            Function<Function<Integer, Integer>, Function<Function<Integer, Integer>, Function<Integer, Integer>>> {}

    @Test
    void test() {
        System.out.println(compose.apply(triple).apply(square).apply(2));
    }

    @Test
    void testAbstract() {
        System.out.println(composeAbstract.apply(triple).apply(square).apply(2));
    }
}

