package com.example.task13;

public class Task13Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = {9, 1100, 7, 8};
        removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(arr));
         */
    }

    static int[] removeMoreThen1000(int[] arr) {
        if (arr == null) return null;
        if (arr.length == 0) return arr;
        int count = 0;
        for (int i : arr)
            if (i <= 1000) count++;
        int[] resArray = new int[count];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] <= 1000) {
                resArray[j] = arr[i];
                j++;
            }
        }
        return resArray;

    }

}