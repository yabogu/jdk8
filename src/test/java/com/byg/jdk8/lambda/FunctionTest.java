package com.byg.jdk8.lambda;

import lombok.extern.slf4j.Slf4j;

import java.util.function.Function;

@Slf4j
public class FunctionTest {

    public void test1() {
        Function<String,Integer> toInteger = Integer::valueOf;
        Function<String, String> backToString = toInteger.andThen(String::valueOf);
    }
}
