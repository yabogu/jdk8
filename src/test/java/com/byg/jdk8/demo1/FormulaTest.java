package com.byg.jdk8.demo1;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
public class FormulaTest {

    @Test
    public void calculate() {
        Formula formula = new Formula() {
            @Override
            public double calculate(int a) {
                return sqrt(a*100);
            }
        };
        log.info("formula.calculate输出结果:{}",String.valueOf(formula.calculate(36)));
        log.info("formula.sqrt输出结果:{}",String.valueOf(formula.sqrt(16)));

    }
}