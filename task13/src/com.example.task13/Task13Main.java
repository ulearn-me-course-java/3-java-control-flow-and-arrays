package com.example.task13;

public class Task13Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int[] arr = {9, 1100, 7, 8,1568};
        removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static int[] removeMoreThen1000(int[] arr) {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        if (arr != null && arr.length > 0) {
            int newLength = 0;
            for (int item : arr) {
                if (item <= 1000) newLength++;
            }
            int[] newArr = new int[newLength];
            int index = 0;
            for (int item : arr) {
                if (item <= 1000) newArr[index++] = item;
            }
            return newArr;
        } else return arr;
    }

}