package com.example.task11;

public class Task11Main {
    public static void main(String[] args) {

        int[] arr = {};
        swap(arr);

        System.out.println(java.util.Arrays.toString(arr));

    }

    static void swap(int[] arr) {
        if(arr == null || arr.length == 0){
            return;
        }

        int minNumber = arr[0];
        int index0fMinElement = 0;

        for(int i = 1; i < arr.length; i++){
            if(minNumber >= arr[i]){
                minNumber = arr[i];
                index0fMinElement = i;
            }
        }

        int data = arr[index0fMinElement];
        arr[index0fMinElement] = arr[0];
        arr[0] = data;

    }

}