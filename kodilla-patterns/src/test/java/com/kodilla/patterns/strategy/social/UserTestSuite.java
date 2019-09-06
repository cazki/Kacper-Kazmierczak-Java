package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies(){
        //Given
        User millennials = new Millenials("Eryk");
        User yGeneration = new YGeneration("Michal");
        User zGeneration = new ZGeneration("Kasia");

        //When
        String snapchat = millennials.sharePost();
        String twitter = yGeneration.sharePost();
        String facebook = zGeneration.sharePost();

        //Then
        Assert.assertEquals("Snapchat", snapchat);
        Assert.assertEquals("Twitter", twitter);
        Assert.assertEquals("Facebook", facebook);
    }

    @Test
    public void testIndividualSharingStrategy(){
        //Given
        User millenials = new Millenials("Eryk");
        millenials.setSocialPublisher(new FacebookPublisher());
        //When
        String facebook = millenials.sharePost();
        //Then
        Assert.assertEquals("Facebook", facebook);

    }
}
