package com.byg.jdk8.lambda;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.function.Consumer;

@Slf4j
public class ConsumersTest {

    @Test
    public void test1() {
        Consumer<Person> greeter = (p) -> System.out.println("Hello"+p.getFirstName());
        greeter.accept(new Person("aaa","bbb"));
    }
}
