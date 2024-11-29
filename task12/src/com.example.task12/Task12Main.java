package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {

        int[] arr = {9, 11, 7, 8, 3, -1, 15, 4};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }

    static void selectionSort(int[] arr) {
        if(arr != null && arr.length != 0)
        {
            for(int i = 0; i < arr.length; i++)
            {
                int min = Integer.MAX_VALUE;
                int minPos = 0;

                for(int j = i; j < arr.length; j++)
                {
                    if(arr[j] < min)
                    {
                        min = arr[j];
                        minPos = j;
                    }
                }

                arr[minPos] = arr[i];
                arr[i] = min;
            }
        }

    }

}