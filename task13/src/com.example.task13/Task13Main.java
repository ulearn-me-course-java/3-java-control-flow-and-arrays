package com.example.task13;

public class Task13Main {
    public static void main(String[] args) {
        int[] arr = {9, 1100, 7, 8, 1111, 5};
        removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static int[] removeMoreThen1000(int[] arr) {
        if(arr == null){
            return null;
        }
        if(arr.length == 0){
            return arr;
        }
        int count = 0;
        for(int i : arr){
            if(i <= 1000){
                count += 1;
            }
        }
        int[] newArray = new int[count];
        int index = 0;
        for(int i : arr){
            if(i <= 1000){
                newArray[index] = i;
                index++;
            }
        }
        return newArray;
    }

}