package com.byg.jdk8.lambda;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

@Slf4j
public class SuppliersTest {

    @Test
    public void testSuppliers() {
        Supplier<Person> personSupplier = Person::new;
        personSupplier.get();
    }
}
