package com.example.task10;

public class Task10Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int[] arr = {7, 7, 7};
        System.out.println(numMin(arr));

    }

    static int numMin(int[] arr) {

        int min = arr[0];
        int num = 0;
        for(int i = 1; i <arr.length; i++){
            if(arr[i] <= min) {
                min = arr[i];
                num = i;
            }
        }

        return num;
    }

}