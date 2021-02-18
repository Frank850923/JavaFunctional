package com.frankhacks;

import org.junit.jupiter.api.Test;

public class Excercise210Test {

    <A, B, C> Function<A, Function<B, C>> curriedTuple(Function<Tuple<A, B>, C> f) {
        return a -> b -> f.apply(new Tuple<>(a, b));
    }

}

class Tuple<T, U> {

    public final T _1;
    public final U _2;

    public Tuple(T t, U u) {
        this._1 = t;
        this._2 = u;
    }
}
