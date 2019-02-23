package com.example.task09;

import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Task09Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int[] arr = new int[]{};
        System.out.println(min(arr));

    }

    static int min(int[] arr) {
        return IntStream.of(arr).min().orElse(0);
    }

}