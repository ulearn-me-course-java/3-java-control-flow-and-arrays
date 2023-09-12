package com.example.task11;

public class Task11Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        int[] arr;

        arr = null;
        swap(arr);
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }

    static void swap(int[] arr) {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        if (arr == null){
            return;
        }
        int res = 0;
        for (int i=0;i<arr.length;i++){
            if (arr[res]>=arr[i]){
                res = i;
            }
        }
        int a = arr[0];
        arr[0] = arr[res];
        arr[res] = a;
    }

}