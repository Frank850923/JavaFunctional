package com.frankhacks;

import org.junit.jupiter.api.Test;

public class Excercise29Test {
    <A, B, C, D> String func(A a, B b, C c, D d) {
        return String.format("%s, %s, %s, %s", a, b, c, d);
    }

    <A, B, C, D> Function<String, Function<String, Function<String, Function<String, String>>>> curriedFunc() {
        return a -> b -> c -> d -> String.format("%s, %s, %s, %s", a, b, c, d);
    }

    @Test
    void test() {
        System.out.println(curriedFunc().apply("a").apply("b").apply("c").apply("d"));
    }
}

