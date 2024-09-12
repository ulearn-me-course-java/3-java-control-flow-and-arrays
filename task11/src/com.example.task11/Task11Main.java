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

    static int numMin(int[] arr) {
        int min = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[min] >= arr[i]) {
                min = i;
            }
        }
        return min;
    }
    static void swap(int[] arr) {
        if (arr == null) return;
        if(arr.length == 0) return;
        int minElIndex = numMin(arr);
        int firstElIndex = 0;
        if (minElIndex == firstElIndex)
            return;
        int temp = arr[minElIndex];
        arr[minElIndex] = arr[firstElIndex];
        arr[firstElIndex] = temp;
    }

}