package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculationsAdd() {
        //given
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = applicationContext.getBean(Calculator.class);
        //when
        int a = 2;
        int b = 4;
        //then
        assertEquals(6, calculator.add(a, b));
    }

    @Test
    public void testCalculationsSub() {
        //given
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = applicationContext.getBean(Calculator.class);
        //when
        int a = 10;
        int b = 5;
        //then
        assertEquals(5, calculator.sub(a, b));
    }

    @Test
    public void testCalculationsMul() {
        //given
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = applicationContext.getBean(Calculator.class);
        //when
        int a = 5;
        int b = 11;
        //then
        assertEquals(55, calculator.mul(a, b));
    }

    @Test
    public void testCalculationsDiv() {
        //given
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = applicationContext.getBean(Calculator.class);
        //when
        int a = 4;
        int b = 2;
        //then
        assertEquals(2, calculator.div(a, b));
    }
}

