package com.example.task13;

import java.util.ArrayList;

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
        if (arr == null)
            return null;

        ArrayList<Integer> filteredArr = new ArrayList<>();
        for (int x : arr) {
            if (x < 1000)
                filteredArr.add(x);
        }

        int[] result = new int[filteredArr.size()];
        int i = 0;
        for (int x : filteredArr) {
            result[i++] = x;
        }

        return result;
    }

    static int[] removeMoreThen1000variant2(int[] arr) {
        if (arr == null)
            return null;
        int count1000 = 0;
        for (int x : arr){
            if (x >= 1000)
                count1000++;
        }
        int[] result = new int[arr.length - count1000];
        int i = 0;
        for (int x : arr){
            if (x < 1000)
                result[i++] = x;
        }
        return  result;
    }

}