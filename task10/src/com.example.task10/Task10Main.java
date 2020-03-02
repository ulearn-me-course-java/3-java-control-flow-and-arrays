package com.example.task10;

public class Task10Main {
    public static void main(String[] args) {

        int[] arr = {0, 0, 0, 0};
        System.out.println(numMin(arr));

    }

    static int numMin(int[] arr) {
        int i;
        int num = 0;
        int min = arr[0];
        if(arr.length == 0)
            return 0;
        for(i = 0; i < arr.length; i++) {
            if(min >= arr[i]) {
                min = arr[i];
                num = i;
            }
        }
        return num;
    }

}