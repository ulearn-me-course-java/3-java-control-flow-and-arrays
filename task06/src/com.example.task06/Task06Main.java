package com.example.task06;

import java.util.ArrayList;

public class Task06Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getMax(1, 2, 3, 4));
         */
    }

    static int getMax(int a, int b, int c, int d) {
        Integer[] max = new Integer[]{a, b, c, d};
        int result = Integer.MIN_VALUE;
        for(int i = 0; i < max.length; i++){
            if(max[i] > result){
                result = max[i];
            }
        }
        return result;
    }

}