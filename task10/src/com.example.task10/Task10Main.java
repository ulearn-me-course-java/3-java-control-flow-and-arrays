package com.example.task10;

public class Task10Main {
    public static void main(String[] args) {

        int[] arr = {7, 3, 3};
        System.out.println(numMin(arr));

    }

    static int numMin(int[] arr) {
        int min = arr[0];
        int elem = 0;
        for(int i = 0; i< arr.length; i++){
            if(arr[i]<=min){
                min=arr[i];
                elem = i;
            }
        }
        return elem;
    }

}