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
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        int m = 2147483647;
        int im = 0;
        for (int i = 0; i < arr.length; i++) {
            if (m > arr[i]){
                m = arr[i];
                im = i;
            }
        }
        int a0 = arr[0];
        arr[0] = m;
        arr[im] = a0;
    }

}