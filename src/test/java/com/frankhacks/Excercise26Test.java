package com.frankhacks;

import org.junit.jupiter.api.Test;

public class Excercise25Test {
    Function<Integer, Integer> triple = x -> x * 3;
    Function<Integer, Integer> square = x -> x * x;

    static <T, U, V> Function<Function<T, U>,
              Function<Function<V, T>,
              Function<V, U>>> higherCompose() {
        return f1 -> f2 -> arg -> f1.apply(f2.apply(arg));
    }




    @Test
    void test() {
        Integer result = Excercise25Test.<Integer, Integer, Integer>higherCompose()
                .apply(triple)
                .apply(square)
                .apply(2);
        System.out.println(result);
    }
}

