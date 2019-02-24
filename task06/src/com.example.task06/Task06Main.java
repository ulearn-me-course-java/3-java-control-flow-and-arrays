package com.example.task06;

public class Task06Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getMax(1, 2, 3, 4));
         */
    }

    static int getMax(int ... arr) {
        int max = Integer.MIN_VALUE;
        for (int value : arr) {
            max = value > max ? value : max;
        }
        return max;
    }

}