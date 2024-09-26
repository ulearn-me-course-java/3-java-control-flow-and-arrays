package com.example.task11;

public class Task11Main {
    public static void main(String[] args) {
        int[] arr = null;
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static void swap(int[] arr) {
         if (arr!=null && arr.length!=0) {
            int min = arr[0];
            int index = 0;
            for (int i = 0; i < arr.length; i++) {
                 min = Math.min(min, arr[i]);
                 if (min == arr[i])
                    index = i;
            }
         arr[index] = arr[0];
         arr[0] = min;
        }
    }

}