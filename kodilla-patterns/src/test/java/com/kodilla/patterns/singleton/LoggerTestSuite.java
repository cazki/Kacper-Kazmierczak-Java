package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void getLastLogTest(){
        //Given
        String firstLog = "it's first log";
        String secondLog = "it's second log";
        //When
        Logger.getInstance().log(firstLog);
        Logger.getInstance().log(secondLog);
        //Then
        Assert.assertEquals(secondLog, Logger.getInstance().getLastLog());
    }
}