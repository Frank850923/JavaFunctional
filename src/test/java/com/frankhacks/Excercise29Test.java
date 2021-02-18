package com.frankhacks;

import org.junit.jupiter.api.Test;

public class Excercise28Test {
    Function<Integer, Function<Integer, Integer>> addTwoTerms = x -> y -> x + y;

    <A, B, C> Function<B, C> partialA(A a, Function<A, Function<B, C>> f) {
        return f.apply(a);
    }

    <A, B, C>  Function<A, C> partialB(B b, Function<A, Function<B, C>> f) {
        return a -> f.apply(a).apply(b);
    }

    @Test
    void test() {
        Function<Integer, Integer> addedA = partialA(1, addTwoTerms);
        System.out.println(addedA.apply(2));
    }
}

