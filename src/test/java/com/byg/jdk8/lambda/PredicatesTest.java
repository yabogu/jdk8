package com.byg.jdk8.lambda;

import cn.hutool.core.io.LineHandler;
import lombok.extern.slf4j.Slf4j;

import java.util.Objects;
import java.util.function.Predicate;

@Slf4j
public class PredicatesTest {

    public void test1() {
        Predicate<String> predicate = s->s.length()>0;
        boolean foo = predicate.test("foo");
        boolean foo1 = predicate.negate().test("foo");

        Predicate<Boolean> notNull = Objects::nonNull;
        Predicate<Boolean> isNull = Objects::isNull;
        Predicate<String> isEmpty = String::isEmpty;
        Predicate<String> isNotEmpty = isEmpty.negate();

    }
}
