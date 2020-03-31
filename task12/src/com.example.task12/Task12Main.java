package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {
        int[] arr = {9, 11, 7, 8};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        if(arr==null||arr.length==0) return;

        int min;
        int num;

        for(int i=0;i<arr.length;i++) {
            min = arr[i];
            num = i;
            for (int j = i; j < arr.length; j++) {
                if(arr[j]<min) {
                    min = arr[j];
                    num = j;
                }
            }

            int qwe = arr[i];
            arr[i] = min;
            arr[num] = qwe;
        }
    }

}