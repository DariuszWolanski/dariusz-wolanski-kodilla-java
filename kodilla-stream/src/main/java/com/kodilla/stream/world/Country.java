package com.kodilla.stream.world;

import java.math.BigInteger;
import java.util.Objects;

public final class Country {

    private final String nameCountry;
    private final int populationSize;

    public Country(String nameCountry, int populationSize) {
        this.nameCountry = nameCountry;
        this.populationSize = populationSize;
    }

    public String getNameCountry() {
        return nameCountry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return populationSize == country.populationSize && Objects.equals(nameCountry, country.nameCountry);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameCountry, populationSize);
    }

    @Override
    public String toString() {
        return "Country{" +
                "nameCountry='" + nameCountry + '\'' +
                ", populationSize=" + populationSize +
                '}';
    }

    public BigInteger getPopulationSize() {
        BigInteger populationOfCountryOfBigInteter = new BigInteger(String.valueOf(populationSize));
        return populationOfCountryOfBigInteter;
    }
}
