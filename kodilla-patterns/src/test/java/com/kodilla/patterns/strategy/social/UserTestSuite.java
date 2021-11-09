package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {

        //Given
        Millenials steven = new Millenials("Steven Links");
        ZGeneration john = new ZGeneration("John Hemerald");
        YGeneration mark = new YGeneration("Mark Spencer");

        //When
        String stevenShouldSocialPublisher = steven.getSocialPublisher();
        System.out.println("Steven should: " + stevenShouldSocialPublisher);
        String johnShouldSocialPublisher = john.getSocialPublisher();
        System.out.println("John should: " + johnShouldSocialPublisher);
        String markShouldSocialPublisher = mark.getSocialPublisher();
        System.out.println("Mark should: " + markShouldSocialPublisher);

        //Then
        assertEquals("Snapchat", stevenShouldSocialPublisher);
        assertEquals("Facebook", johnShouldSocialPublisher);
        assertEquals("Twitter", markShouldSocialPublisher);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        Millenials steven = new Millenials("Steven Links");

        //When
        String stevenShouldSocialPublisher = steven.getSocialPublisher();
        System.out.println("Steven should: " + stevenShouldSocialPublisher);
        steven.sharePost(new FacebookPublisher());
        stevenShouldSocialPublisher = steven.getSocialPublisher();
        System.out.println("Steven now should: " + stevenShouldSocialPublisher);
        System.out.println(steven.getSocialPublisher());

         //Then
        assertEquals("Facebook", stevenShouldSocialPublisher);
    }
}
