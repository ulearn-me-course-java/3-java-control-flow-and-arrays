package com.example.task04;

import java.util.stream.IntStream;

public class Task04Main {
    public static void main(String[] args) {
        from0to10000();
    }

    static void from0to10000() {
        IntStream.range(0, 10000)
                .forEach(System.out::println);
    }
}