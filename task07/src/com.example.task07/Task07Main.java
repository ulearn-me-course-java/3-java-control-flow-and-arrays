package com.example.task07;

public class Task07Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        System.out.println(sum(2, 10, 10, 20));

    }

    static int sum(int... arr) {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            s += arr[i];
        }
        return s;
    }

}