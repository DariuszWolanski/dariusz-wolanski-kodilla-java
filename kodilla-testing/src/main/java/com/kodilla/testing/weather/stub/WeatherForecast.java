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

//    public double medianOfTheMeasurements() {
//
//        Map<String, Double> resultMap = new HashMap<>();
//        List<String> list = new ArrayList<>();
//        double middleParamertOfTheCollectionWithAnEvenNumberOfOranges;
//        double firtsOfmiddleParamertOfTheCollectionWithAnOddNumberOfOranges;
//        double secondOfmiddleParamertOfTheCollectionWithAnOddNumberOfOranges;
//
//        String keyOfTheCollectionWithAnEvenNumberOfOranges;
//        String firstKeyOfTheCollectionWithAnOddNumberOfOranges;
//        String secondKeyOfTheCollectionWithAnOddNumberOfOranges;
//
//        double sizeOfList;
//        double result;
//
//
//        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
//            resultMap.put(temperature.getKey(), temperature.getValue());
//               //list = Arrays.asList(temperature.getKey());
//        }
//
//        System.out.println(list.size());
//
//        for (int i = 0; i < list.size(); i++){
//            System.out.println(list.get(i));
//        }
//
//        sizeOfList = temperatures.getTemperatures().size();
//        middleParamertOfTheCollectionWithAnEvenNumberOfOranges = ((sizeOfList / 2) - 0.5);
//        firtsOfmiddleParamertOfTheCollectionWithAnOddNumberOfOranges = temperatures.getTemperatures().size() / 2 - 1;
//        secondOfmiddleParamertOfTheCollectionWithAnOddNumberOfOranges = temperatures.getTemperatures().size() / 2;
//        firstKeyOfTheCollectionWithAnOddNumberOfOranges = list.get((int) firtsOfmiddleParamertOfTheCollectionWithAnOddNumberOfOranges);
//        secondKeyOfTheCollectionWithAnOddNumberOfOranges = list.get((int) secondOfmiddleParamertOfTheCollectionWithAnOddNumberOfOranges);
//
//        if (list.size() % 2 != 0 && middleParamertOfTheCollectionWithAnEvenNumberOfOranges < list.size()) {
//            keyOfTheCollectionWithAnEvenNumberOfOranges = list.get((int) (middleParamertOfTheCollectionWithAnEvenNumberOfOranges));
//            result = resultMap.get(keyOfTheCollectionWithAnEvenNumberOfOranges);
//        } else {
//            if (firtsOfmiddleParamertOfTheCollectionWithAnOddNumberOfOranges < list.size() && secondOfmiddleParamertOfTheCollectionWithAnOddNumberOfOranges < list.size()) {
//                result = resultMap.get(firstKeyOfTheCollectionWithAnOddNumberOfOranges) + resultMap.get(secondKeyOfTheCollectionWithAnOddNumberOfOranges) / 2;
//            }
//
//        }
//
//        return result;
//    }
}





