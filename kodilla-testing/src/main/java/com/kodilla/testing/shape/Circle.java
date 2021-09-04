package com.kodilla.testing.shape;

public class Circle implements Shape {
    private String shapeName = "Circle";
    private double field;


    public Circle(double radius){
        this.field = Math.PI * radius * radius;

    }
    public String getShapeName(){
        return this.shapeName;
    }

    public double getField(){
        return this.field;
    }

    @Override
    public String toString() {
        return "ShapeName: " + shapeName + ", field: " + field;
    }
}
