package com.example.task10;

public class Task10Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = {7, 5, 9};
        System.out.println(numMin(arr));
         */
    }

    static int numMin(int[] arr) {
        int minimal = Integer.MAX_VALUE;
        int numOfMin = 0;

        int i = -1;
        for (int number : arr){
            i += 1;
            if (number <= minimal) {
                minimal = number;
                numOfMin = i;
            }
        }
        return numOfMin;
    }

}