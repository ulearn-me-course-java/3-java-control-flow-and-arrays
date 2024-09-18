package com.example.task09;
import java.util.Arrays;
public class Task09Main {
    public static void main(String[] args) {}

    static int min(int[] arr) {
        if (arr.length !=0)
        {
            return Arrays.stream(arr).min().getAsInt();
        }
        return 0;
    }
}