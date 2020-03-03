package com.example.task10;

public class Task10Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int[] arr = {10, 9, 7};
        System.out.println(numMin(arr));

    }

    static int numMin(int[] arr) {
        int min = 0;
        int num = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(num >= arr[i]){
                num = arr[i];
                min = i;
            }
        }
        return min;
    }

}