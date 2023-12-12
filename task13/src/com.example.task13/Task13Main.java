package com.example.task13;

public class Task13Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int[] arr = {9, 1100, 7, 8};
        System.out.println(java.util.Arrays.toString(removeMoreThen1000(arr)));

    }

    static int[] removeMoreThen1000(int[] arr) {
        if(arr != null && arr.length  != 0){
            int counter = 0;
            for (int i : arr){
                if (i < 1000){
                    counter += 1;
                }
            }
            int[] result = new int[counter];
            int fill = 0;
            for (int elem : arr){
                if (elem < 1000){
                    result[fill] = elem;
                    fill++;
                }
            }
            return result;
        }
        return arr;
    }
}