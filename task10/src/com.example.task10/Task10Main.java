package com.example.task10;

public class Task10Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = {7, 5, 9};
        System.out.println(numMin(arr));
         */
    }

    static int numMin(int[] arr) {
        int index0fMinElement = 0;

        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] >= arr[i + 1]){
                index0fMinElement = i + 1;
            }
        }

        return index0fMinElement;
    }

}