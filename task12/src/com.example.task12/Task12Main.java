package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {
        int[] arr = {9, 11, 7, 8};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        try{
            int length = arr.length;
            for (int i = 0; i < length-1; i++)
            {
                int indexOfMin = i;
                for (int j = i+1; j < length; j++)
                    if (arr[j] < arr[indexOfMin])
                        indexOfMin = j;
                int temp = arr[indexOfMin];
                arr[indexOfMin] = arr[i];
                arr[i] = temp;
            }
        }
        catch (NullPointerException exp){
        }
    }

}