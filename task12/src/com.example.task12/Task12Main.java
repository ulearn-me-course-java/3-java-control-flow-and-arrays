package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int[] arr = {9, 11, 7, 8};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }

    static void selectionSort(int[] arr) {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        for (int j = 0; j < arr.length; j++) {
            int m = 2147483647;
            int im = 0;
            for (int i = j; i < arr.length; i++) {
                if (m > arr[i]) {
                    m = arr[i];
                    im = i;
                }
            }
            int aj = arr[j];
            arr[j] = m;
            arr[im] = aj;
        }
    }
}