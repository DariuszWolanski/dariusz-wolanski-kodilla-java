package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {

    private final String nameContinent;
    private List<Country> countryList = new ArrayList<>();

    public Continent(String nameContinent) {
        this.nameContinent = nameContinent;
    }

    public String getNameContinent() {
        return nameContinent;
    }

    public List<Country> getCountryList() {
        return countryList;
    }

    public List<Country> countryListEurope(){
        countryList.add(new Country("Poland", 36_050_010));
        countryList.add(new Country("Germany", 66_030_401));
        return new ArrayList<>();
    }

    public List<Country> countryListAsia(){
        countryList.add(new Country("China", 1020_007_010));
        countryList.add(new Country("India", 1202_030_007));
        return new ArrayList<>();
    }

    public List<Country> countryListSouthAmerica(){
        countryList.add(new Country("Brasil", 54_456_023));
        countryList.add(new Country("Argentina", 57_000_000));
        return new ArrayList<>();
    }





}
