package com.example.task13;

public class Task13Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        int[] arr = {9, 1100, 7, 8};
        removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static int[] removeMoreThen1000(int[] arr) {
        if (arr == null) return null;
        if (arr.length == 0) return arr;

        int size = 0;
        for (int arg : arr){
            if (arg < 1000){
                size++;
            }
        }

        int[] newArray = new int[size];

        int index = 0;
        for (int arg : arr){
            if (arg < 1000){
                newArray[index] = arg;
                index++;
            }
        }
        return  newArray;
    }

}