package com.example.task13;

import javax.xml.bind.Element;
import java.util.*;

public class Task13Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        int[] arr = {9, 1100, 7, 8};
        removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static int[] removeMoreThen1000(int[] arr) {
        if (arr == null) return null;
        if (arr.length == 0) return arr;
        int[] newArr = new int[arr.length - 1];
        int j = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 1000) {
                j = i - 1;
                continue;
            }
            j++;
            newArr[j] = arr[i];
        }
        return newArr;
    }
}