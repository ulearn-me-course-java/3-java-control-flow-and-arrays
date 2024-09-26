package com.example.task10;

public class Task10Main {
    public static void main(String[] args) {
        int[] arr = {7, 5, 9};
        System.out.println(numMin(arr));
    }

    static int numMin(int[] arr) {
        int min = arr[0];
        int minIndex = 0, count = 0;
        for (int num : arr){
            if (num <= min){
                min = num;
                minIndex = count;
            }
            count++;
        }
        return minIndex;
    }

}