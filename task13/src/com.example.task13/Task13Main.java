package com.example.task13;

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
        if ((arr != null) && (arr.length != 0)) {

            ArrayList<Integer> new_copy = new ArrayList<>();
            for (int num:arr){
                if(num < 1000)
                    new_copy.add(num);
            }
            int[] array = new int[new_copy.size()];
            for (int i =0; i < new_copy.size(); i++)
               array[i] = new_copy.get(i);
            return array;
        }
        else {
            return arr;
        }
    }

}