package com.example.task10;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task10Main {
    public static void main(String[] args) {
        int[] arr = {7, 5, 9};
        System.out.println(numMin(arr));
    }

    static int numMin(int[] arr) {
        return Arrays
                .stream(arr)
                .boxed()
                .collect(Collectors.toList())
                .lastIndexOf(IntStream.of(arr).min().getAsInt());
    }
}