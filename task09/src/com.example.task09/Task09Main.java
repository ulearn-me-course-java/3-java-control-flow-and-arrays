package com.example.task09;

public class Task09Main {
    public static void main(String[] args) {
    }

    static int min(int[] arr) {
        int minElem = Integer.MAX_VALUE;
        for (int elem: arr) {
            if (elem < minElem) minElem = elem;
        }
        return minElem;
    }
}