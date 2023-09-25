package com.example.task01;

public class Task01Main {
    public static void main(String[] args) {
        Tests tests = new Tests();
        tests.testCanGetDriverLicense();
    }

    static boolean canGetDriverLicense(int age) {
        return age >= 18;
    }
}
