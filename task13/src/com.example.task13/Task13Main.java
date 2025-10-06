package com.example.task13;

public class Task13Main
{
    public static void main(String[] args)
    {
        int[] test = {9, 1100, 7, 8};
        test = removeMoreThen1000(test);
        System.out.println(java.util.Arrays.toString(test));
    }

    static int[] removeMoreThen1000(int[] arr)
    {
        if (arr == null) return null;

        int count = 0;
        for (int number : arr)
        {
            if (number <= 1000) count++;
        }

        int[] newArr = new int[count];

        int index = 0;
        for (int number : arr)
        {
            if (number <= 1000)
            {
                newArr[index] = number;
                index++;
            }
        }
        return newArr;
    }
}