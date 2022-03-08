package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        from0to10000();
    }

    static void from0to10000() {
        int[] numbers = new int[10000];

        for (int i = 0; i < 10000; i++) {
            numbers[i] = i;
        }

        for (int arg : numbers) {
            System.out.println(arg);
        }
    }
}