package com.example.task09;

public class Task09Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        System.out.println(min(2, -1, 3));

    }

    static int min(int... arr) {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        int m = 2147483647;
        for (int i = 0; i < arr.length; i++) {
            if (m > arr[i])
                m = arr[i];
        }
        return m;
    }

}