package com.example.task13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task13Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = {9, 1100, 7, 8};
        removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(arr));
         */
    }

    static int[] removeMoreThen1000(int[] arr) {
        if (arr == null) return null;

        int counter = 0;

        for (int value : arr) {
            if (value >= 1000) continue;
            counter += 1;
        }

        int[] answer = new int[counter];
        counter = 0;

        for (int value : arr) {
            if (value >= 1000) continue;
            answer[counter] = value;
            counter += 1;
        }

        return answer;
    }

}