package com.example.task08;

public class Task08Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int[] arr = new int[] {8_000_000, 9_000_000};
        System.out.println(mult(arr));
    }

    static long mult(int[] arr) {
        if (arr.length == 0)
            return 0;

        long mul = 1;
        for (int elem : arr){
            mul = mul * elem;
        }
        return mul;
    }

}