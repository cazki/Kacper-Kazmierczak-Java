package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //Given
        int[] number = new int[] {2,3,4,5,5};
        //When
        Double average = ArrayOperations.getAverage(number);
        //Then
        Assert.assertEquals(3.8, average,1);
    }
}
