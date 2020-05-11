package com.byg.jdk8.lambda;

/***
 * 通过一个对象的方法进行引用测试lambda
 */
public class Something {

    String startsWith(String s) {
        return String.valueOf(s.charAt(0));
    }
}
