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
        if (arr == null || arr.length == 0)
        {
            return;
        }
        int min1;
        int index;
        for (int i = 0; i<arr.length; i++)
        {
            min = arr[i];
            index=i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < min1) {
                    min1 = arr[j];
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = min1;
            arr[index] = temp;
        }
    }

}