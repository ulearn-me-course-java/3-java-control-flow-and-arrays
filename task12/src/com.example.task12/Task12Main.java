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
        Add(arr, 0);
        Add(arr,1);
    }

    static void Add(int[] arr, int start)
    {
        int max = Integer.MAX_VALUE;
        int counter = -1;
        if(arr == null) return;
        for (int i = start; i < arr.length; i++)
        {
            if(max >= arr[i]) {
                max = arr[i];
                counter = i;
            }
        }
        if(counter == -1) return;
        int temp = arr[counter];
        arr[counter] = arr[start];
        arr[start] = temp;
    }

}