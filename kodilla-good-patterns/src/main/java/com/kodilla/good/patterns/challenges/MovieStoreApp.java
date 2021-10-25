package com.kodilla.good.patterns.challenges;

import java.util.List;
import java.util.stream.Collectors;

public class MovieStoreApp {

    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();

        List<String> titleList = movieStore.getMovies().entrySet().stream()
                .flatMap(stringListEntry -> stringListEntry.getValue().stream())
                .collect(Collectors.toList());
        String title = titleList.stream().collect(Collectors.joining("!", "", ""));

        System.out.println(title);

    }
}
