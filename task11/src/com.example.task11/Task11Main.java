package com.example.task11;

import org.assertj.core.util.Arrays;

public class Task11Main {
    public static void main(String[] args) {

        int[] arr = {7, 5, 9, 3, 6};
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }

    static void swap(int[] arr) {

        if(arr != null && arr.length != 0)
        {
            int min = Integer.MAX_VALUE;
            int position = 0;

            for(int i = 0; i < arr.length; i++)
            {
                if(arr[i] < min)
                {
                    min = arr[i];
                    position = i;
                }
            }

            arr[position] = arr[0];
            arr[0] = min;
        }
    }

}