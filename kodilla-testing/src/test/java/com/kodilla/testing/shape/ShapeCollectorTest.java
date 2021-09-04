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
        Triangle triangle = new Triangle(15,14);
        Square square = new Square(12);

        ArrayList<Shape> shapeList = new ArrayList<>();
        ShapeCollector shapeCollector = new ShapeCollector(shapeList);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(square);

        int sizeShapeList = shapeList.size();

        //When
        ArrayList<Shape> shapeListTest = new ArrayList<>();
        ShapeCollector shapeCollectorTest = new ShapeCollector(shapeListTest);
        shapeCollectorTest.addFigure(circle);
        shapeCollectorTest.addFigure(triangle);
        shapeCollectorTest.addFigure(square);

        int sizeShapeListTest = shapeListTest.size();

        //Then

        Assertions.assertEquals(sizeShapeListTest, sizeShapeList);

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
        ArrayList<Shape> shapeArrayList = new ArrayList<>();
        ShapeCollector shapeCollectorTest = new ShapeCollector(shapeArrayList);
        shapeCollectorTest.addFigure(circle);
        shapeCollectorTest.addFigure(triangle);
        shapeCollectorTest.addFigure(square);

        shapeCollectorTest.removeFigure(triangle);

        int sizeShapeListTest = shapeCollectorTest.getShapeList().size();

        //Then
        Assertions.assertEquals(sizeShapeListTest, sizeShapeList);

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
        ShapeCollector shapeCollectorTest = new ShapeCollector(shapeList);

        Shape figureTest = shapeCollectorTest.getFigure(1);

        //Then
        Assertions.assertEquals(figureTest.toString(), figure.toString());

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
        ShapeCollector shapeCollectorTest = new ShapeCollector(shapeList);
        shapeCollectorTest.addFigure(circle);
        shapeCollectorTest.addFigure(triangle);
        shapeCollectorTest.addFigure(square);

        shapeCollectorTest.showFigures();

        //Then
        Assertions.assertEquals(shapeCollectorTest.showFigures(), shapeCollector.showFigures());

    }
}
