package com.example.task11;

public class Task11Main {
    public static void main(String[] args) {

        swap(null);
    }

    static void swap(int[] arr) {

        if(arr != null && arr.length > 0){
            int minIndex = numMin(arr);
            int tempMin = arr[minIndex];

            arr[minIndex] = arr[0];
            arr[0] = tempMin;
        }
    }

    static int numMin(int[] arr) {

        int minIndex = 0;
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] <= min){
                min = arr[i];
                minIndex = i;
            }
        }

        return minIndex;
    }
}