package com.example.task13;

public class Task13Main {
    public static void main(String[] args) {
        int[] arr = {9, 1100, 7, 8};
        arr = removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static int[] removeMoreThen1000(int[] arr) {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        if (arr == null)
            return null;
        if (arr.length == 0)
            return arr;
        else {
            int k = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > 1000) {
                    k += 1;
                    for (int j = i + 1; j < arr.length; j++) {
                        arr[j - 1] = arr[j];
                    }
                }
            }
            int[] resarr = new int[arr.length - k];
            int idx = 0;
            for (int i : arr) {
                if (i <= 1000 && idx < arr.length - k ) {
                    resarr[idx] = i;
                    idx += 1;
                }
            }
            return resarr;
        }
    }
}