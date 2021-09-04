package com.kodilla.testing.shape;

public class Square implements Shape{
    String shapeName = "Square";
    double field;


    public Square(double sideLength) {
        this.field = sideLength * sideLength;
    }

    public String getShapeName() {
        return this.shapeName;
    }

    public double getField() {
        return this.field;
    }

    @Override
    public String toString() {
        return "shapeName: " + shapeName + ", field: " + field;
    }


}
