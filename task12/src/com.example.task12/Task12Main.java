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
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        if (arr == null || arr.length == 0) return;

        for (int startindex = 0; startindex < arr.length; startindex++) {
            int minIndex = startindex;
            for (int i = startindex; i < arr.length; i++) {
                if (arr[i] < arr[minIndex]) minIndex = i;
            }
            int temp = arr[startindex];
            arr[startindex] = arr[minIndex];
            arr[minIndex] = temp;
        }



    }

}