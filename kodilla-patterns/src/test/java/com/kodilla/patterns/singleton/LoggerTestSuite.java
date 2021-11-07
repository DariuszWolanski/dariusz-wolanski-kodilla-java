package com.kodilla.patterns.singleton;

import com.kodilla.patterns.Logger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    private static Logger logger;

    @Test
    void testGetLast() {
        //Given
        logger = Logger.LOG;
        logger.addLog("New log - number 1");

        //When
        String logName = logger.getLastLog();
        System.out.println("Opened: " + logName);

        //Then
        assertEquals("New log - number 1", logName);
    }


}
