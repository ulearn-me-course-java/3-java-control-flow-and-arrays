package com.example.task02;

public class Task02Main {

    static String getSeason(int monthNumber) {
        for (Season season : Season.getDefault()) {
            if (season.IsSeason(monthNumber)) return season.name;
        }
        throw new IllegalArgumentException();
    }
}