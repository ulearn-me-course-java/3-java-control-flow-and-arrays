package com.example.task08;

public class Task08Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        System.out.println(mult(2, 3));

    }

    static long mult(int... arr) {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        if (arr == null) {
            return 0;
        }
        int m = 1;
        for (int i = 0; i < arr.length; i++) {
            m *= arr[i];
        }
        return m;
    }

}