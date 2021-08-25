package com.kodilla.testing.collection;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.*;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;

//import org.junit.Before;
//import org.junit.Test;

@DisplayName("Collection Test Suite")
public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test case: begin");
    }
    @After
    public void after(){
        System.out.println("Test case: end");
    }
    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }

    @DisplayName("when create List with event values, " +
            "then result should return true"
    )
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        ArrayList<Integer> emptyList = new ArrayList<Integer>();
        //When
        ArrayList<Integer> listNumbers = OddNumbersExterminator.exterminate(emptyList);
        System.out.println("Testing" + listNumbers);
        //Then
        Assertions.assertEquals(emptyList,listNumbers);
    }

    @DisplayName("when create first List with something values, " +
            "then create second List have the same values"
    )
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        //ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(5, 56, 24, 32, 65, 17));
        //ArrayList<Integer> oddList = new ArrayList<Integer>(Arrays.asList(56, 24, 32));

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(0,10);
        list.add(1,105);
        list.add(2,1001);
        list.add(3,100);
        list.add(4,1056);

        ArrayList<Integer> newList = OddNumbersExterminator.exterminate(list);
        //When
        ArrayList<Integer> listNumbers = OddNumbersExterminator.exterminate(list);
        System.out.println("Testing" + listNumbers);
        //Then
        Assertions.assertEquals(newList, listNumbers);
        //Assertions.assertEquals(oddList, listNumbers);
    }
}


