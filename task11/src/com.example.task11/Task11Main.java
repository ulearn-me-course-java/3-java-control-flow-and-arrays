package com.example.task11;

public class Task11Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        int[] arr = {7, 5, 9};
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static void swap(int[] arr) {
        if (arr != null && arr.length != 0){
        int minimum = numMin(arr);
        int temp = arr[minimum];
        arr[minimum] = arr[0];
        arr[0] = temp;
        }
    }
    static int numMin(int[] arr) {
        int current_min = arr[0];
        int current_min_num = 0;
        for (int i = 1; i <= arr.length - 1; i++) {
            if (arr[i] <= current_min) {
                current_min = Math.min(current_min, arr[i]);
                current_min_num = i;
            }
        }
        return current_min_num;
    }

}