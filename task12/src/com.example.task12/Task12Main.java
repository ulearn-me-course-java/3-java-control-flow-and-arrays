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
        if(arr == null || arr.length ==0 ) return;

        for( int i =0; i< arr.length; i++ ){
            int indexMin = arr.length-1;
            for(int v = i ; v < arr.length; v++ ){
                if(arr[indexMin] >  arr[v]) indexMin = v;
            }
            int min = arr[indexMin];
            arr[indexMin] = arr[i];
            arr[i] = min;
        }
    }

}