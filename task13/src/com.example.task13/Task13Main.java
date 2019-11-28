package com.example.task13;

import java.util.List;
import java.util.ArrayList;

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
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        if (arr == null) {
            return null;
        }

        List<Integer> tmpList = new ArrayList();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 1000) {
                tmpList.add(arr[i]);
            }
        }
        return tmpList.stream().mapToInt(Integer::intValue).toArray();
    }

}
