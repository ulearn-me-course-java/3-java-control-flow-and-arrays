package com.example.task02;

import java.util.Arrays;

public class Task02Main {

    static String getSeason(int monthNumber) {
        return Arrays.stream(Season.getDefault()).
                filter(o -> o.IsSeason(monthNumber)).
                findFirst()
                .get()
                .name;
    }
}