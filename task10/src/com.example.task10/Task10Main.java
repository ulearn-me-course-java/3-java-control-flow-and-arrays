package com.example.task10;

import java.util.Arrays;

public class Task10Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int[] arr = {1, 2, 3, 4};
        System.out.println(numMin(arr));

    }

    static int numMin(int[] arr) {
        int min = Arrays.stream(arr).min().getAsInt();
        int minIndex = 0;
        int minCount = 0;
        for (int i =0; i<arr.length;i++)
            if (arr[i] == min)  {
                minCount++;
            minIndex = i;
            }

        return minIndex;
    }

}