package com.example.task10;

public class Task10Main {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};
        System.out.println(numMin(arr));

    }

    static int numMin(int[] arr) {
        int indexOfMin = 0;
        int index = 1;
        int min = arr[0];
        while (index < arr.length) {
            if (min >= arr[index]) {
                min = arr[index];
                indexOfMin = index;
            }
            index++;
        }
        return indexOfMin;
    }

}