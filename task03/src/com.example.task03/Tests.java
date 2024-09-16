package com.example.task03;

import org.junit.Assert;
import org.junit.Test;

public class Tests {

    @Test
    public void testGetNameOfWeekDays() {
        Assert.assertEquals("1 - понедельник", "Monday", Task03Main.getNameOfWeekDays(1));
        Assert.assertEquals("2 - вторник", "Tuesday", Task03Main.getNameOfWeekDays(2));
        Assert.assertEquals("3 - среда", "Wednesday", Task03Main.getNameOfWeekDays(3));
        Assert.assertEquals("4 - четверг", "Thursday", Task03Main.getNameOfWeekDays(4));
        Assert.assertEquals("5 - пятница", "Friday", Task03Main.getNameOfWeekDays(5));
        Assert.assertEquals("6 - суббота", "Saturday", Task03Main.getNameOfWeekDays(6));
        Assert.assertEquals("7 - воскресенье", "Sunday", Task03Main.getNameOfWeekDays(7));
        Assert.assertEquals("8 - That's not a day of the week", "That's not a day of the week", Task03Main.getNameOfWeekDays(8));
    }

}