package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = {9, 11, 7, 8};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));
         */
    }

    static void selectionSort(int[] arr) {
        if (arr != null) {
            int size = arr.length;
            if (size != 0) {
                for (int j = 0; j < size - 1; j++) {
                    int min = arr[j];
                    int count = j;
                    for (int i = j + 1; i < size; i++) {
                        if (arr[i] <= min) {
                            min = arr[i];
                            count = i;
                        }
                    }
                    arr[count] = arr[j];
                    arr[j] = min;
                }
            }
        }
    }

}