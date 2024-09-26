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
        if (arr == null || arr.length == 0)
            return;

        int numSort = 0;
        int min = Integer.MAX_VALUE;
        int numMin = 0;

        while (numSort < arr.length) {
            for (int i = numSort; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                    numMin = i;
                }
            }
            int temp = arr[numSort];
            arr[numSort] = arr[numMin];
            arr[numMin] = temp;
            numSort++;
            min = Integer.MAX_VALUE;
        }

    }

}