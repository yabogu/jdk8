package com.byg.jdk8.lambda;

import com.alibaba.fastjson.JSON;
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

    /***
     * 通过静态方法引用更加简洁
     */
    @Test
    public void convert1() {
        Converter<String,Integer> converter = Integer::valueOf;
        Integer converted = converter.convert("123");
        log.info("字符串123转换结果:{}",converted);
    }

    /***
     *通过一个对象的方法进行引用
     */
    @Test
    public void testSomething() {
        Something something = new Something();
        Converter<String,String> converter = something::startsWith;
        String converted = converter.convert("123");
        log.info("字符串123转换结果:{}",converted);
    }

    /***
     * 测试构造方法
     * @FunctionalInterface
     * public interface PersonFactory<P extends Person> {
     *     P create(String firstName, String lastName);
     * }
     */
    @Test
    public void testPerson() {
        PersonFactory<Person> personFactory = Person::new;
        Person person = personFactory.create("Peter", "Parker");
        log.info("打印对象:{}",JSON.toJSONString(person));
    }


}