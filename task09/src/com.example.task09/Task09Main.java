package com.example.task09;

public class Task09Main {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 2;
        arr[1] = -1;
        arr[2] = 3;
        //System.out.println(min(arr));

    }

    static int min(int[] arr) {
        int min = arr[0];
        int num = 0;
        while (num < arr.length){
            if (arr[num]<min){
                min = arr[num];
                num++;
            }
            else num++;
        }
        return min;
    }

}