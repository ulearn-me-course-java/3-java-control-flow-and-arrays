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
        int count_num = 0;
        for (int num : arr) {
            if (num <= 1000) {
                count_num++;
            }
        }
        int[] new_arr = new int[count_num];
        count_num = 0;
        for (int num : arr) {
            if (num <= 1000) {
                new_arr[count_num] = num;
                count_num++;
            }
        }
        return new_arr;
    }

}