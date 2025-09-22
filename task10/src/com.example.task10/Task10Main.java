package com.example.task10;

public class Task10Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int[] arr = {7, 5, 9, 2, 4, 4, 1};
        System.out.println(numMin(arr));
    }

    static int numMin(int[] arr) {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей

        int min = Integer.MAX_VALUE;

        int index = 0;
        int indexMin = 0;

        for (int i : arr){
            if (i <= min){
                min = i;
                indexMin = index;
            }

            index += 1;
        }

        return indexMin;
    }

}