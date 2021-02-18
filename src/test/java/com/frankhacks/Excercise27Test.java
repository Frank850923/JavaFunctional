package com.frankhacks;

import org.junit.jupiter.api.Test;

public class Excercise26Test {
    Function<Integer, Integer> triple = x -> x * 3;
    Function<Integer, Integer> square = x -> x * x;

    static <T, U, V> Function<Function<U, V>,
            Function<Function<V, T>,
            Function<U, T>>> higherAndThen() {
        return f1 -> f2 -> arg -> f2.apply(f1.apply(arg));
    }

    static <T, U, V> Function<Function<T, U>,
            Function<Function<U, V>,
                    Function<T, V>>> higherAndThenB() {
        return f1 -> f2 -> arg -> f2.apply(f1.apply(arg));
    }

    static <T, U, V> Function<Function<T, U>,
            Function<Function<V, T>,
                    Function<V, U>>> higher() {
        return f1 -> f2 -> arg -> f1.apply(f2.apply(arg));
    }


    static <T, U, V> Function<Function<V, U>,
            Function<Function<T, V>,
                    Function<T, U>>> higherB() {
        return f1 -> f2 -> arg -> f1.apply(f2.apply(arg));
    }




    @Test
    void test() {
        Integer result = Excercise26Test.<Integer, Integer, Integer>higherAndThen()
                .apply(triple)
                .apply(square)
                .apply(2);
        System.out.println(result);
    }
}

