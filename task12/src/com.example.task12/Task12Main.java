package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int[] arr = {1, 2, 3, 4};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }

    static void selectionSort(int[] arr) {
        if(arr == null || arr.length == 0) return;
        for(int i = 0; i < arr.length; i++){
            int min = i;
            int num = Integer.MAX_VALUE;
            for(int j = i; j < arr.length; j++){
                if(arr[j] < num) {
                    min = j;
                    num = arr[j];
                }
            }
            arr[min] = arr[i];
            arr[i] = num;
        }
    }

}