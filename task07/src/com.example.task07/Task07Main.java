package com.example.task07;

public class Task07Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        int[] myArray = new int[4];
        myArray[0] = 1;
        myArray[1] = 2;
        myArray[2] = 3;
        myArray[3] = 4;
        System.out.println(sum(myArray));
    }

    static int sum(int[] arr) {
        int result = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            result += arr[i];
        }
        return result;
    }

}