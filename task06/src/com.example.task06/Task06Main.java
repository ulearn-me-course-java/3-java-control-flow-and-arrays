package com.example.task06;

import javax.swing.text.html.Option;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.OptionalInt;

public class Task06Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        System.out.println(getMax(1, 2, 3, 4));

    }

    static int getMax(int a, int b, int c, int d) {
        int[] arr = {a,b,c,d};
        OptionalInt max = Arrays.stream(arr).max();
        return max.getAsInt();
    }

}