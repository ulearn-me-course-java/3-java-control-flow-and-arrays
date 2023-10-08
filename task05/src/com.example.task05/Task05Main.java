package com.example.task05;

public class Task05Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getMin(5,4,3));
         */
    }

    static int getMin(int a, int b, int c) {
        int[] input = {a, b, c};
        int minNumber = a;

        for(int i = 0; i < input.length - 1; i++){
            if(input[i] > input[i + 1]){
                minNumber = input[i + 1];
            }
        }

        return minNumber;
    }
}