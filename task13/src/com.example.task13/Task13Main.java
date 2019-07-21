package com.example.task13;
import java.util.ArrayList;

public class Task13Main {
    static int[] removeMoreThen1000(int[] arr) {
        if (arr == null) return null;
        ArrayList<Integer> newarr = new ArrayList<Integer>();
        for (int i = 0;i<arr.length;i++)
            if (arr[i]<1000)
                newarr.add(arr[i]);
        int[] finalarr = new int[newarr.size()];
        for (int i = 0; i< newarr.size();i++)
            finalarr[i] = newarr.get(i);
        return finalarr;
    }
}