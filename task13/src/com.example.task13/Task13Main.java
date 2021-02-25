package com.example.task13;

import java.util.ArrayList;
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
        if(arr == null) {
            return null;
        }
        List<Integer> elements = new ArrayList<>();
        for (int elem: arr
             ) {
            if(elem <= 1000) {
                elements.add(elem);
            }
        }
        int[] result = new int[elements.size()];
        for(int i = 0; i < elements.size(); i++) {
            result[i] = elements.get(i);
        }
        return result;
    }

}