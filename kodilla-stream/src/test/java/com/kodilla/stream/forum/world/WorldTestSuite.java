package com.kodilla.stream.forum.world;

import com.kodilla.stream.world.Continent;
import com.kodilla.stream.world.Country;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    void testGetPopulationSize() {
        //Given

        List<Country> countryListOfEurope = new ArrayList<>();
        countryListOfEurope.add(new Country("Poland", 37_050_100));
        countryListOfEurope.add(new Country("Germany", 65_020_035));
        countryListOfEurope.add(new Country("France", 80_120_034));

        List<Country> countryListOfAsia = new ArrayList<>();
        countryListOfAsia.add(new Country("China", 100_034_050));
        countryListOfAsia.add(new Country("India", 156_014_098));
        countryListOfAsia.add(new Country("Japan", 57_301_070));

        List<Country> countryListOfAfrica = new ArrayList<>();
        countryListOfAfrica.add(new Country("RPA", 40_033_025));
        countryListOfAfrica.add(new Country("Niger", 47_056_109));


        Continent continentFirst = new Continent("Europe", countryListOfEurope);
        Continent continentSecond = new Continent("Asia", countryListOfAsia);
        Continent continentThird = new Continent("Africa", countryListOfAfrica);

        List<Continent> continentListTest = new ArrayList<>();
        continentListTest.add(continentFirst);
        continentListTest.add(continentSecond);
        continentListTest.add(continentThird);

        //When

        BigInteger populationSize = continentListTest.stream()
                .flatMap(continent -> continent.getCountryList().stream())
                .map(Country::getPopulationSize)
                .reduce(BigInteger.ZERO, (population, current) -> population.add(current));


        //Then
        BigInteger expectedPopulationSize = new BigInteger("582628521");
        assertEquals(expectedPopulationSize, populationSize);
    }
}
