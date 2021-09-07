package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;

public class StreamMain {

    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        String text = "text to beautify ";
        poemBeautifier.beautify(text, (textLambda -> text + "ABC"));
        poemBeautifier.beautify(text, (textLambda -> text.toUpperCase()));
        poemBeautifier.beautify(text, (textLambda -> text.toLowerCase()));
        poemBeautifier.beautify(text, (textLambda -> text + "is so beautiful"));
        poemBeautifier.beautify(text, (textLambda -> text + "will be beautiful"));

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);

    }
}
