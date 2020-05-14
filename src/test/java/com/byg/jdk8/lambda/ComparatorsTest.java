package com.byg.jdk8.lambda;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

@Slf4j
public class ComparatorsTest {

    @Test
    public void test1() {
        Comparator<Person> comparator = (p1,p2) -> p1.getFirstName().compareTo(p2.getFirstName());
        Person p1 = new Person("p1","p1111");
        Person p2 = new Person("p2","p2222");
        comparator.compare(p1,p2);
        comparator.reversed().compare(p1,p2);
    }
}
