package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {
        int[] arr = {9, 11, 7, 8};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        if (arr == null) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            int minIndex = getMinNumIndex(arr, i);

            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    static int getMinNumIndex(int[] arr, int startIndex) {
        int min = arr[startIndex];
        int minIndex = startIndex, count = startIndex;

        for (int i = startIndex; i < arr.length; i++){
            if (arr[i] <= min){
                min = arr[i];
                minIndex = count;
            }
            count++;
        }
        return minIndex;
    }
}