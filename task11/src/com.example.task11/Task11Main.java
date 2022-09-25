package com.example.task11;

public class Task11Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int[] arr = {7, 5, 3};
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }

    static void swap(int[] arr) {

        int min = arr[0];
        int num = 0;

        for(int i = 1; i <arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
                num = i;
            }
        }
        int temp = 0;
        temp = arr[0];
        arr[0] = arr[num];
        arr[num] = temp;
    }

}