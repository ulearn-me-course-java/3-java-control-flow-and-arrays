package com.example.task13;

import java.util.ArrayList;
import java.util.HashSet;

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
        if (arr == null || arr.length == 0) return arr;

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for(int item : arr) {
            if (item < 1000)
                arrayList.add(item);
        }

        int[] newArray = new int[arrayList.size()];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = arrayList.get(i);
        }

        return newArray;
    }

}