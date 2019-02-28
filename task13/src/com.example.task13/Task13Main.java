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
        if(arr != null && arr.length > 0){
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < arr.length; i++){
                if (arr[i] < 1000)
                    list.add(arr[i]);
            }
            int[] array = new int[list.size()];
            for(int i = 0; i < list.size(); i++)
                array[i] = list.get(i);
            return array;
        }
        return arr;
    }

}