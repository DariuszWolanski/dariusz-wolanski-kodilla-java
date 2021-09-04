package com.kodilla.testing.shape;

public class Triangle implements Shape{

    private String shapeName = "Triangle";
    private double field;


    public Triangle(double sideLength, double height) {
        this.field = 0.5 * sideLength * height;

    }

    public String getShapeName() {
        return this.shapeName;
    }

    public double getField() {
        return this.field;
    }

    @Override
    public String toString() {
        return "ShapeName: " + shapeName + ", field: " + field;
    }

}
