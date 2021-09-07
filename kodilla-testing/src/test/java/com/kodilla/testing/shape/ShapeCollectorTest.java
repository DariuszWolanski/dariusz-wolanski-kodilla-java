package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

import java.util.ArrayList;


public class ShapeCollectorTest {


    private static int testCounter = 0;

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

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
        Circle circle = new Circle(15);
        Triangle triangle = new Triangle(15, 14);
        Square square = new Square(12);
        ArrayList<Shape> shapeList = new ArrayList<>();
        ShapeCollector shapeCollector = new ShapeCollector(shapeList);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(square);
        int sizeShapeList = shapeCollector.getShapeList().size();

        //When

        //Then
        Assertions.assertEquals(3, sizeShapeList);

    }


    @Test
    public void testRemoveFigure() {
        //Given
        Circle circle = new Circle(23);
        Triangle triangle = new Triangle(12, 18);
        Square square = new Square(12);
        ArrayList<Shape> shapeList = new ArrayList<>();
        ShapeCollector shapeCollector = new ShapeCollector(shapeList);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(square);
        shapeCollector.removeFigure(triangle);
        int sizeShapeList = shapeCollector.getShapeList().size();

        //When


        //Then
        Assertions.assertEquals(2, sizeShapeList);

    }

    @Test
    public void testGetFigure() {
        //Given
        Circle circle = new Circle(23);
        Triangle triangle = new Triangle(12, 18);
        Square square = new Square(12);
        ArrayList<Shape> shapeList = new ArrayList<>();
        shapeList.add(circle);
        shapeList.add(triangle);
        shapeList.add(square);
        ShapeCollector shapeCollector = new ShapeCollector(shapeList);
        Shape figure = shapeCollector.getFigure(1);

        //When
        ArrayList<Shape> shapeListTest = new ArrayList<>();
        shapeListTest.add(circle);
        shapeListTest.add(triangle);
        shapeListTest.add(square);
        Shape figureTest = shapeListTest.get(1);

        //Then
        Assertions.assertEquals(figureTest, figure);

    }

    @Test
    public void testShowFigures() {
        //Given
        Circle circle = new Circle(23);
        Triangle triangle = new Triangle(12, 18);
        Square square = new Square(12);
        ArrayList<Shape> shapeList = new ArrayList<>();
        ShapeCollector shapeCollector = new ShapeCollector(shapeList);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(square);
        shapeCollector.showFigures();

        //When

        //Then
        Assertions.assertEquals(shapeList, shapeCollector.showFigures());

    }
}
