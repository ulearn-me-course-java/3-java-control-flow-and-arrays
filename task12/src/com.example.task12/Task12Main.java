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

//        Рассматриваем элементы с индексами от 0 до последнего.
//        Находим среди них минимальный элемент и переставляем его с элементом с индексом 0.
//
//        Рассматриваем элементы с индексами от 1 до последнего.
//        Находим среди них минимальный элемент и переставляем его с элементом с индексом 1.
//
//        И так далее.


        int index = 0;
        int min;
        for  (int i = 0; i < arr.length; i++){
            min =  Integer.MAX_VALUE;
            for (int j = i; j < arr.length; j++){
                if(arr[j]<= min){
                    min = arr[j];
                    index = j;
                }
            }
            arr[index] = arr[i];
            arr[i] = min;

        }

    }

}