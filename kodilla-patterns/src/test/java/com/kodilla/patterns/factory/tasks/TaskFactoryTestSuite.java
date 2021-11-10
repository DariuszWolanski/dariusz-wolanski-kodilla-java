package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskFactoryTestSuite {

    @Test
    void testShoppingTask(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Tasks shopping = factory.makeTask(TaskFactory.SHOPPING_TASK);
        //Then
        assertEquals("Buying clothes", shopping.getTaskName());
        assertEquals(false, shopping.isTaskExecuted());
        shopping.executeTask();
        assertEquals(true, shopping.isTaskExecuted());
    }

    @Test
    void testPaintingTask(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Tasks painting = factory.makeTask(TaskFactory.PAINTING_TASK);
        //Then
        assertEquals("Buying color pattern", painting.getTaskName());
        assertEquals(false, painting.isTaskExecuted());
        painting.executeTask();
        assertEquals(true, painting.isTaskExecuted());
    }

    @Test
    void testDrivingTask(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Tasks driving = factory.makeTask(TaskFactory.DRIVING_TASK);
        //Then
        assertEquals("Buying a car", driving.getTaskName());
        assertEquals(false, driving.isTaskExecuted());
        driving.executeTask();
        assertEquals(true, driving.isTaskExecuted());
    }
}
