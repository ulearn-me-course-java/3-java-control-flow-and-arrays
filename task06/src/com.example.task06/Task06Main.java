package com.example.task06;

public class Task06Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getMax(1, 2, 3, 4));
         */
    }

    static int getMax(int a, int b, int c, int d) {
        int[] array = new int[3];
        array[0] = b;
        array[1] = c;
        array[2] = d;
        int max = a;
        for (int j : array) {
            if (j > max)
                max = j;
        }
        return max;
    }

}