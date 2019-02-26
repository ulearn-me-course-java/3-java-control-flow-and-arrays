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

        int count = 0;
        int number = 0;
        if(arr == null) return null;
        for (int temp:arr) {
            if(temp > 1000)
                count += 1;
        }
        int[] mass = new int[arr.length - count];
        for (int temp:arr) {
            if(temp < 1000) {
                mass[number] = temp;
                number += 1;
            }
        }
        return  mass;
    }

}