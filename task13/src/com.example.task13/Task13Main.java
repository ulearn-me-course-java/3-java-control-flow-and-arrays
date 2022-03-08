package com.example.task13;
import java.util.*;

public class Task13Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        int[] a = {10, 20, 1, 2000};
        int[] b = removeMoreThen1000(a);
        for(int ar : b)
        {
            System.out.print(ar + " ");
        }
    }

    static int[] removeMoreThen1000(int[] arr) {
        List<Integer> l = new ArrayList<Integer>();

        for(int i = 0; i < arr.length; i++)
        {
           if(arr[i] < 1000)
           {
               l.add(arr[i]);
           }
        }
        int[] newArr = new int[l.size()];
        for(int i = 0; i < newArr.length; i++)
        {
            newArr[i] = l.get(i);
        }

        return newArr;
    }

}
