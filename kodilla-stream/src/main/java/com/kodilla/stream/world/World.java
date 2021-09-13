package com.kodilla.stream.world;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public final class World {

    private final List<Continent> continentList = new ArrayList<>();

    public List<Continent> getContinentList() {
        return continentList;
    }

    public BigInteger getPopulationSize() {
        BigInteger populationOfTheWorldOfBigInteter = getContinentList().stream()
                .flatMap(continent -> continent.getCountryList().stream())
                .map(country -> country.getPopulationSize())
                .reduce(BigInteger.ZERO, (sum, current) -> sum = sum.add(current));

        return populationOfTheWorldOfBigInteter;
    }


}
