package com.example.task13;

public class Task13Main {
    public static void main(String[] args) {

        int[] arr = {9, 1100, 7, 8, 999};
        int[] newArr = removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(newArr));

    }

    static int[] removeMoreThen1000(int[] arr) {
        if(arr != null && arr.length  != 0)
        {
            int size = 0;

            for(int i = 0; i < arr.length; i++)
            {
                if(arr[i] < 1000)
                    size++;
            }

            int[] newArr = new int[size];

            int fill = 0;
            for(int i = 0; i < arr.length; i++)
            {
                if(arr[i] < 1000)
                {
                    newArr[fill] = arr[i];
                    fill++;
                }
            }

            return  newArr;
        }
        else
            return arr;
    }

}