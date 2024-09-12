package com.example.task13;

public class Task13Main
{
    public static void main(String[] args)
    {
        int[] arr = {9, 1100, 7, 8};
        removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static int[] removeMoreThen1000(int[] arr)
    {
        if (arr == null)
            return null;
        int len = 0;
        for (int v : arr)
            if (v <= 1000)
                len++;
        int[] result = new int[len];
        int i = 0;
        for (int v : arr)
            if (v <= 1000)
            {
                result[i] = v;
                i++;
            }
        return result;
    }
}