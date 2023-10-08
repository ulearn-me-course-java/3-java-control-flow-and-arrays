package com.example.task10;

public class Task10Main {
    public static void main(String[] args) {

        int[] arr = {7, 10, 9};
        System.out.println(numMin(arr));

    }

    static int numMin(int[] arr) {
        int minNumber = arr[0];
        int index0fMinElement = 0;

        for(int i = 1; i < arr.length; i++){
            if(minNumber >= arr[i]){
                minNumber = arr[i];
                index0fMinElement = i;
            }
        }

        return index0fMinElement;
    }

}