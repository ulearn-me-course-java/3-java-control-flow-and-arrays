package com.example.task12;

public class Task12Main
{
    public static void main(String[] args)
    {
        int[] arr = {9, 11, 7, 8};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static void selectionSort(int[] arr)
    {
        if (arr == null || arr.length == 0)
            return;

        int first = 0;

        while (first < arr.length)
        {

            int index = 0;
            int minN = Integer.MAX_VALUE;
            for (int i = first; i < arr.length; i++)
            {
                if (arr[i] <= minN) {
                    minN = arr[i];
                    index = i;
                }
            }
            arr[index] = arr[first];
            arr[first] = minN;

            first++;
        }
    }
}