package com.example.task05;

public class Task05Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        System.out.println(getMin(5,4,3));

    }

    static int getMin(int a, int b, int c) {
        int[] arr = {a, b, c};
        int min = arr[0];
        for (int i = 0; i != arr.length; i++)
            if (arr[i] < min)
                min = arr[i];
        return min;
    }
}