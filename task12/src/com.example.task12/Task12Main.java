package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {
        int[] arr = {5, 5, 5};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        if (arr == null || arr.length == 0)
        {
            return;
        }

        for (int i = 0; i < arr.length; i++)
        {
            int minValue = Integer.MAX_VALUE;
            int index = i;
            for (int j = i; j < arr.length; j++)
            {
                if (minValue >= arr[j]) {
                    minValue = arr[j];
                    index = j;
                }
            }

            int tempValue = arr[i];
            arr[i] = arr[index];
            arr[index] = tempValue;
        }
    }

}