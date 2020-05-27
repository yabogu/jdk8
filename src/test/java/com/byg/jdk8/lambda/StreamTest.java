package com.byg.jdk8.lambda;

import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.event.annotation.BeforeTestClass;

import java.util.List;

@Slf4j
public class StreamTest {

    private static List<String> stringList = Lists.newArrayList();

    @BeforeAll
    public static void initData() {
        stringList.add("aaa1");
        stringList.add("bbb2");
        stringList.add("aaa3");
        stringList.add("ccc3");
        stringList.add("dd4");
        stringList.add("aaa2");
        stringList.add("ee5");
    }

    @Test
    public void testFilter() {
        stringList.stream()
                .filter((s)->s.startsWith("a"))
                .forEach(System.out::println);
    }

    @Test
    public void testSorted() {
        stringList.stream()
                  .sorted()
                .filter((s)->s.startsWith("a"))
                .forEach(System.out::println);

    }

    @Test
    public void testMap() {
        stringList.stream()
                .map(String::toUpperCase)
                .sorted((a,b)->b.compareTo(a))
                .forEach(System.out::println);

    }

    /***
     * anyMatch 任意一个匹配返回true 终结操作
     * allMatch 每一个全部匹配才返回true 终结操作
     */
    @Test
    public void testMatch() {
        boolean anyMatch = stringList.stream()
                .anyMatch(s -> s.startsWith("a"));
        log.info("anyMatch:{}",anyMatch);
        boolean allMatch = stringList.stream()
                .allMatch(s -> s.startsWith("a"));
        log.info("allMatch:{}",allMatch);
    }


}
