package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;


@DisplayName("Collection Test Suite")
public class CollectionTestSuite {
    @BeforeEach
    public void before(){
        System.out.println("Test case: begin");
    }

    @AfterEach
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
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> emptyList = new ArrayList<Integer>();
        //When
        ArrayList<Integer> listNumbers = oddNumbersExterminator.exterminate(emptyList);
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
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(0,10);
        list.add(1,105);
        list.add(2,1001);
        list.add(3,100);
        list.add(4,1056);

        ArrayList<Integer> newList = oddNumbersExterminator.exterminate(list);
        //When

        ArrayList<Integer> listNumbers = oddNumbersExterminator.exterminate(list);
        System.out.println("Testing" + listNumbers);
        //Then
        Assertions.assertEquals(newList, listNumbers);

    }
}


