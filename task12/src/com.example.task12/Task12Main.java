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

        int firstIndex = 0;

        while (firstIndex < arr.length) {

            int index = 0;
            int minNumb = Integer.MAX_VALUE;
            for (int i = firstIndex; i < arr.length; i++) {
                if (arr[i] <= minNumb) {
                    minNumb = arr[i];
                    index = i;
                }
            }
            arr[index] = arr[firstIndex];
            arr[firstIndex] = minNumb;

            firstIndex++;
        }
    }

}