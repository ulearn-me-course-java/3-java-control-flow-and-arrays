package com.example.task02;

import org.junit.Assert;
import org.junit.Test;

public class Tests {

    @Test
    public void testGetSeason() {
        Assert.assertEquals("1 - январь -> зима", "Winter", Task02Main.getSeason(1));
        Assert.assertEquals("2 - февраль -> зима", "Winter", Task02Main.getSeason(2));
        Assert.assertEquals("3 - март -> весна", "Spring", Task02Main.getSeason(3));
        Assert.assertEquals("4 - апрель -> весна", "Spring", Task02Main.getSeason(4));
        Assert.assertEquals("5 - май -> весна", "Spring", Task02Main.getSeason(5));
        Assert.assertEquals("6 - июнь -> лето", "Summer", Task02Main.getSeason(6));
        Assert.assertEquals("7 - июль -> лето", "Summer", Task02Main.getSeason(7));
        Assert.assertEquals("8 - августь -> лето", "Summer", Task02Main.getSeason(8));
        Assert.assertEquals("9 - сентябрь -> осень", "Fall", Task02Main.getSeason(9));
        Assert.assertEquals("10 - октябрь -> осень", "Fall", Task02Main.getSeason(10));
        Assert.assertEquals("11 - ноябрь -> осень", "Fall", Task02Main.getSeason(11));
        Assert.assertEquals("12 - декабрь -> зима", "Winter", Task02Main.getSeason(12));
    }

}