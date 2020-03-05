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
        if (arr == null || arr.length == 0) return arr;
        int newArrLen = 0;
        for (int value : arr)
            if (value <= 1000) newArrLen++;
        int[] newArr = new int[newArrLen];
        int curIndex = 0;
        for (int value : arr) {
            if (value <= 1000) {
                newArr[curIndex] = value;
                curIndex++;
            }
        }
        return newArr;
    }
}