package com.example.task13;

public class Task13Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

    }

    static int[] removeMoreThen1000(int[] arr) {
        if (arr == null || arr.length == 0) return arr;

        int overThousand = 0;
        for (int num : arr) if (num > 1000) overThousand++;
        int[] res = new int[arr.length - overThousand];

        int counter = 0;
        for (int num : arr) {
            if (num <= 1000) {
                res[counter] = num;
                counter++;
            }
        }

        return res;
    }

}