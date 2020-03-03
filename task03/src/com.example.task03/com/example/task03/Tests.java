package com.example.task03;

import org.junit.Assert;
import org.junit.Test;

public class Tests {

    @Test
    public void testGetNameOfWeekDays() {
        Assert.assertEquals("1 - понедельник", "понедельник", com.example.task03.Task03Main.getNameOfWeekDays(1));
        Assert.assertEquals("2 - вторник", "вторник", com.example.task03.Task03Main.getNameOfWeekDays(2));
        Assert.assertEquals("3 - среда", "среда", com.example.task03.Task03Main.getNameOfWeekDays(3));
        Assert.assertEquals("4 - четверг", "четверг", com.example.task03.Task03Main.getNameOfWeekDays(4));
        Assert.assertEquals("5 - пятница", "пятница", com.example.task03.Task03Main.getNameOfWeekDays(5));
        Assert.assertEquals("6 - суббота", "суббота", com.example.task03.Task03Main.getNameOfWeekDays(6));
        Assert.assertEquals("7 - воскресенье", "воскресенье", com.example.task03.Task03Main.getNameOfWeekDays(7));
    }

}