package com.example.task06;

import org.junit.Assert;
import org.junit.Test;

public class Tests {

    @Test
    public void testGetMax() {
        Assert.assertEquals(0, com.example.task06.Task06Main.getMax(0, 0, 0, 0));
        Assert.assertEquals(4, com.example.task06.Task06Main.getMax(1, 2, 3, 4));
        Assert.assertEquals(5, com.example.task06.Task06Main.getMax(5, 4, 3, 2));
        Assert.assertEquals(9, com.example.task06.Task06Main.getMax(5, 9, 3, 2));
        Assert.assertEquals(7, com.example.task06.Task06Main.getMax(5, 4, 7, 6));
        Assert.assertEquals(Integer.MAX_VALUE, com.example.task06.Task06Main.getMax(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE));
        Assert.assertEquals(Integer.MIN_VALUE, com.example.task06.Task06Main.getMax(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE));
    }

}