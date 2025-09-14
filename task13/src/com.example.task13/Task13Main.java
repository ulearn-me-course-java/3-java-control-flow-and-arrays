package com.example.task13;

import org.assertj.core.util.Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class Task13Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int[] arr = {9, 1100, 7, 8};
        arr = removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }

    static int[] removeMoreThen1000(int[] arr) {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++)
            if (arr[i] <= 1000)
                list.add(arr[i]);
        return list.stream().mapToInt(i -> i).toArray();
    }

}