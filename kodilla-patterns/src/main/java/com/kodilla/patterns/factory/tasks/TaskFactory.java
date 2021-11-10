package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String SHOPPING_TASK = "SHOPPING TASK";
    public static final String PAINTING_TASK = "PAINTING TASK";
    public static final String DRIVING_TASK = "DRIVING TASK";

    public final Tasks makeTask(final String shoppingClass) {
        switch (shoppingClass) {
            case "SHOPPING TASK":
                return new ShoppingTask("Buying clothes", "jacket", 1);
            case "PAINTING TASK":
                return new PaintingTask("Buying color pattern", "White", "The wall");
            case "DRIVING TASK":
                return new DrivingTask("Buying a car", "Warsaw", "Driving for a taxi");
            default:
                return null;
        }

    }

}
