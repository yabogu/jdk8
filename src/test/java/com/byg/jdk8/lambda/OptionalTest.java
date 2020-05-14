package com.byg.jdk8.lambda;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.Optional;

@Slf4j
public class OptionalTest {

    @Test
    public void test1() {
        Optional<String> optional = Optional.of("bam");
        optional.isPresent();
        optional.get();
        optional.orElse("fallBack");
        optional.ifPresent((s)->System.out.println(s.charAt(0)));
    }

}
