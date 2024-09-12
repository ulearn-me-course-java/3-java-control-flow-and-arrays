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
        int sum = arr[0];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (sum >= arr[i]){
                sum = arr[i];
                count = i;
            }
        }
        return count;
    }

}