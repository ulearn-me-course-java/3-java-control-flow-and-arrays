package com.example.task08;

public class Task08Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int[] arr = new int[]{};
        System.out.println(mult(arr));

    }

    static long mult(int[] arr) {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        long res = 1;
        for (int i=0;i<arr.length;i++){
            res*=arr[i];
        }
        if (arr.length==0){
            return 0;
        }

        return res;
    }

}