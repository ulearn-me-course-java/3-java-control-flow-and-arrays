package com.example.task13;

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
        if (arr == null) return null;
        if (arr.length == 0) return new int[]{};

        int counter = 0;
        int[] indeces = new int[arr.length];

        for (int j : arr) {
            if (j < 1000) {
                indeces[counter] = j;
                counter++;
            }
        }

        int[] out = new int[counter];

        for (int i = 0; i < counter; i++) {
            out[i] = indeces[i];
        }

        return out;
    }

}