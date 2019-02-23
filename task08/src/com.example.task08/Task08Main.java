package com.example.task08;

import org.assertj.core.util.Arrays;

import java.lang.reflect.Array;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Task08Main {
    public static void main(String[] args) {
    }

    static long mult(int[] arr) {
        if (arr.length == 0)
            return 0;
        long result = 1L;
        for (int i : arr)
            result *= i;
        return result;

    }

    static long mult_with_streams(int[] arr) {
        return arr.length == 0 ? 0 :
                IntStream.of(arr).asLongStream().reduce((x, y) -> x * y).getAsLong();
    }

}