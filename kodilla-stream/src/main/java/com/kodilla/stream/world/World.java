package com.kodilla.stream.world;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public final class World {

    public  List<Continent> getContinentList(){
        final List<Continent> continentList = new ArrayList<>();
        continentList.add(new Continent("Asia"));
        continentList.add(new Continent("Europe"));
        continentList.add(new Continent("South America"));
        return new ArrayList<>();
    }

    public BigInteger getPopulationSize() {
        BigInteger populationOfTheAsiaOfBigInteter = getContinentList().stream()
                        .flatMap(continent -> continent.countryListAsia().stream())
                        .map(country -> country.getPopulationSize())
                        .reduce(BigInteger.ZERO, (sum, current) -> sum = sum.add(current));

        BigInteger populationOfTheEuropeOfBigInteter = getContinentList().stream()
                .flatMap(continent -> continent.countryListEurope().stream())
                .map(country -> country.getPopulationSize())
                .reduce(BigInteger.ZERO, (sum, current) -> sum = sum.add(current));

        BigInteger populationOfTheSouthAmericaOfBigInteter = getContinentList().stream()
                .flatMap(continent -> continent.countryListSouthAmerica().stream())
                .map(country -> country.getPopulationSize())
                .reduce(BigInteger.ZERO, (sum, current) -> sum = sum.add(current));

        BigInteger populationOfTheWorldOfBigInteter = populationOfTheAsiaOfBigInteter
                .add(populationOfTheEuropeOfBigInteter)
                .add(populationOfTheSouthAmericaOfBigInteter);

        return populationOfTheWorldOfBigInteter;
    }


}
