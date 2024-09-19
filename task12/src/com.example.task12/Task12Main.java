package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {

        int[] arr = {9, 11, 7, 8};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }

    static void selectionSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        int indexOfMin = 0;
        int min = arr[0];
        int index = 1;
        while (index < arr.length) {
            if (min > arr[index]) {
                min = arr[index];
                indexOfMin = index;
            }
            index++;
        }

        arr[indexOfMin] = arr[0];
        arr[0] = min;

        int secondMin = Integer.MAX_VALUE;
        index = 1;
        while (index < arr.length){
            if (secondMin > arr[index] && secondMin > min) {
                secondMin = arr[index];
                indexOfMin = index;
            }
            index++;
        }
        arr[indexOfMin] = arr[1];
        arr[1] = secondMin;
    }

}