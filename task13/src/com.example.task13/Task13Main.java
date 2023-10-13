package com.example.task13;

public class Task13Main {
    public static void main(String[] args) {

        int[] arr = {9, 1100, 7, 8};
        System.out.println(java.util.Arrays.toString(removeMoreThen1000(arr)));

    }

    static int[] removeMoreThen1000(int[] arr) {
        int kol = 0;
        for (int i = 0; i< arr.length;i++){
            if(arr[i]<1000){
                kol++;
            }
        }
        int[] arrayRight = new int[kol];
        int j = 0;
        for(int i = 0; i< arr.length;i++){
            if(arr[i]<1000){
                arrayRight[j]=arr[i];
                j++;
            }
        }
        return arrayRight;

    }

}