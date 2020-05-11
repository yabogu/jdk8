package com.byg.jdk8.lambda;

@FunctionalInterface
public interface Converter<F, T> {
    T convert(F from);
}
