package com.example.task11;

public class Task11Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = {7, 5, 9};
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));
         */
    }

    static void swap(int[] arr) {
        if (arr == null || arr.length == 0) return;
        int minimal = Integer.MAX_VALUE;
        int numOfMin = 0;
        int temp = arr[0];
        int i = -1;
        for (int number : arr){
            i += 1;
            if (number <= minimal) {
                minimal = number;
                numOfMin = i;
            }
        }

        arr[0] = arr[numOfMin];
        arr[numOfMin] = temp;
    }
}