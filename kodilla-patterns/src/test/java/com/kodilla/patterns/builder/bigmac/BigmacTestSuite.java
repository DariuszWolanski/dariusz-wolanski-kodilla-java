package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    public void testBigmacNew() {
    //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("wheat roll")
                .sauce("ketchup")
                .ingredient("tomato")
                .ingredient("onion")
                .ingredient("cheese")
                .ingredient("becon")
                .burgers(2)
                .build();

        System.out.println(bigmac);

        //When
        int howManyIngredients = bigmac.getIngredients().size();

        //Then
        assertEquals(4, howManyIngredients);
    }
}
