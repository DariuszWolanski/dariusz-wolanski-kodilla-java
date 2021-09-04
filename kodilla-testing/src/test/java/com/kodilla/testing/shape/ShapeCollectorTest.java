package com.kodilla.testing.shape;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class ShapeCollector {


    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {

        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        //Given
//        ShapeCollector shapeCollector = new ShapeCollector(new ArrayList<Shape>
//                (Arrays.<Shape>asList((Shape) new Circle(20.0),
//                        (Shape) new Triangle(15, 36))));

        ArrayList<Shape> shapeList = new ArrayList<>();
        shapeList.add(new Circle(15));
        shapeList.add((Shape)new Circle(15));
        shapeList.add((Shape)new Circle(15));
        shapeList.add((Shape)new Circle(15));
        ShapeCollector shapeCollector = new ShapeCollector(shapeList);

        //When

        //Then

    }


    @Test
    public void testRemoveFigure() {
        //Given
        Circle circle = new Circle(23);
        Triangle triangle = new Triangle(12, 18);
        Square square = new Square(12);

        //When


        //Then

    }

    @Test
    public void testGetFigure() {
        //Given
        Circle circle = new Circle(23);
        Triangle triangle = new Triangle(12, 18);
        Square square = new Square(12);

       //When



        //Then

    }
    @Test
    public void testShowFigures() {
        //Given
        Circle circle = new Circle(23);
        Triangle triangle = new Triangle(12, 18);
        Square square = new Square(12);

        //When



        //Then

    }
}
