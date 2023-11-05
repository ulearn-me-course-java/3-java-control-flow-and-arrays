package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {

        int[] arr = {9, 11, 7, 8};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        if(arr == null || arr.length == 0){
            return;
        }

        for (int i = 0; i < arr.length - 1; i++){
            int temp = arr[i];
            int count = i;
            for (int j = i + 1; j < arr.length; j++){
                if (temp > arr[j]){
                    temp = arr[j];
                    count = j;
                }
            }
            arr[count] = arr[i];
            arr[i] = temp;
        }
    }

}