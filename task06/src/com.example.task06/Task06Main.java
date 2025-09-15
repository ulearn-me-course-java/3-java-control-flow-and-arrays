package com.example.task06;

public class Task06Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        System.out.println(getMax(2, 2, 3, 4));
    }

    static int getMax(int a, int b, int c, int d) {

        int[] numbers = {a, b, c, d};
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] > max) {
                max = numbers[i];
            }

        }
        return max;

    }

}