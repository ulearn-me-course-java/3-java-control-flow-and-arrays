package com.example.task05;

public class Task05Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getMin(5,4,3));
         */
    }

    static int getMin(int a, int b, int c) {
        int[] temp = {a, b, c};
        int max = Integer.MAX_VALUE;
        for (int f : temp) {
            if(max > f)
                max = f;
        }
        return max;
    }
}