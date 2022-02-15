package com.example.task11;

public class Task11Main {
    public static void main(String[] args) {
        int[] arr = {7, 5, 9};
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static void swap(int[] arr) {
        try{
            if(arr.length != 0 && arr != null) {
                int minValue = Integer.MAX_VALUE;
                int minIndex = 0;
                for (int i = 1; i < arr.length; i++) {
                    if (arr[i] < minValue) {
                        minValue = arr[i];
                        minIndex = i;
                    }
                }
                int temp = arr[minIndex];
                arr[minIndex] = arr[0];
                arr[0] = temp;
            }
        }
        catch (NullPointerException exc){

        };

    }

}