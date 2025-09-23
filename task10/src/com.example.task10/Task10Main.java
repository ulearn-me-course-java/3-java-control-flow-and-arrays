package com.example.task10;

public class Task10Main {
    public static void main(String[] args) {

        int[] arr = {7, 5, 9};
        System.out.println(numMin(arr));

    }

    static int numMin(int[] arr) {
        int minimum = arr[0];
        int index = 0;
        for(int i = 1; i< arr.length; i++){
            if (arr[i]<= minimum){
                minimum = arr[i];
                index = i;
            }
        }
        return index;
    }

}