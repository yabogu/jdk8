package com.byg.jdk8.lambda;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/***
 * @FunctionalInterface
 * public interface Converter<F, T> {
 *     T convert(F from);
 * }
 */
@Slf4j
public class ConverterTest {

    @Test
    public void convert() {
        Converter<String,Integer> converter = from -> Integer.valueOf(from);
        Integer converted = converter.convert("123");
        log.info("字符串123转换结果:{}",converted);
    }
}