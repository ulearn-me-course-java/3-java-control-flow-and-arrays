package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int[] arr = {7, 5, 9};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }

    static void selectionSort(int[] arr) {
        if (arr != null) {
            for (int i = 0; i < arr.length - 1; i++) {
                int indexMin = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] < arr[indexMin])
                        indexMin = j;
                }
                int temp = arr[i];
                arr[i] = arr[indexMin];
                arr[indexMin] = temp;
            }
        }
    }

}