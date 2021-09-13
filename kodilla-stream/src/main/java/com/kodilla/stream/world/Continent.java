package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {

    private final String nameContinent;
    private List<Country> countryList = new ArrayList<>();

    public Continent(String nameContinent, List<Country> countryList  ) {
        this.nameContinent = nameContinent;
        this.countryList = countryList;
    }

    public String getNameContinent() {
        return nameContinent;
    }

    public List<Country> getCountryList() {

        return countryList;
    }


}
