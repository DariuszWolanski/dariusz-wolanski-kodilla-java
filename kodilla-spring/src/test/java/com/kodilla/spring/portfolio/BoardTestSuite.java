package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoardTestSuite {
    @Test
    public void testToDoListBeanExist() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);
        //when
        int numberOfToDoListBean = (int) Arrays.stream(context.getBeanDefinitionNames())
                .filter(c -> c.contains("toDoList"))
                .count();
        //then
        assertEquals(1, numberOfToDoListBean);
    }

    @Test
    public void testInProgressListBeanExist() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);
        //when
        int numberOfInProgressListBean = (int) Arrays.stream(context.getBeanDefinitionNames())
                .filter(c -> c.contains("inProgressList"))
                .count();
        //then
        assertEquals(1, numberOfInProgressListBean);
    }

    @Test
    public void testDoneListBeanExist() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);
        //when
        int numberOfDoneListBean = (int) Arrays.stream(context.getBeanDefinitionNames())
                .filter(c -> c.contains("doneList"))
                .count();
        //then
        assertEquals(1, numberOfDoneListBean);
    }

    @Test
    public void testTaskAdd() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);
        //when
        board.getToDoList().addTask("TaskOne");
        board.getInProgressList().addTask("TaskTwo");
        board.getDoneList().addTask("TaskThree");

        //then
        assertEquals(1, board.getToDoList().getTasks().size());
        assertEquals(1, board.getInProgressList().getTasks().size());
        assertEquals(1, board.getDoneList().getTasks().size());
    }
}
