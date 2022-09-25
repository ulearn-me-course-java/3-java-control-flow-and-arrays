package com.example.task10;

public class Task10Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        int[] arr = {7, 5, 9, 2};
        System.out.println(numMin(arr));
    }

    static int numMin(int[] arr) {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        int result = arr[arr.length - 1];
        int num = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= result) {
                result = arr[i];
                num = i;
            }
        }

        return num;
    }

}