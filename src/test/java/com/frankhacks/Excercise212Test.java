package com.frankhacks;

public class Excercise211Test {

    <A, B, C> Function<A, Function<B, C>> curriedTuple(Function<Tuple<A, B>, C> f) {
        return a -> b -> f.apply(new Tuple<>(a, b));
    }

    <A, B, C> Function<B, Function<A, C>> swap (Function<A, Function<B, C>> f) {
        return b -> a -> f.apply(a).apply(b);
    }
}
