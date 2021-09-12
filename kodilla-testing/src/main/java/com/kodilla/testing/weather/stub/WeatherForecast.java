package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {

    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {

        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }

    public double averageTemperatureOfMeasurements() {
        double temp = 0;

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            temp += temperature.getValue();
        }
        return temp / temperatures.getTemperatures().size();
    }

    public double medianOfTheMeasurements() {

        List<Double> valueList = new ArrayList<>();
        double valueMedian;

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            valueList.add(temperature.getValue());
        }

        Collections.sort(valueList);

        if (valueList.size() % 2 != 0) {
            double a =  ((valueList.size()/2) + 0.5);
            valueMedian = valueList.get((int) a);
        }else {
            valueMedian = (valueList.get(((valueList.size()) / 2  - 1))
                    + valueList.get((valueList.size()) / 2 )) / 2;
        }

        return valueMedian;
    }
}





