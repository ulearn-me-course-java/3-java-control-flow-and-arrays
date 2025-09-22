package com.example.task06;

public class Task06Main {
    public static void main(String[] args) {

        System.out.println(getMax(5, 4, 3, 2));
    }

    static int getMax(int a, int b, int c, int d) {

        int[] numbers = {a, b, c, d};
        int max = numbers[0];
        for(int i = 0; i < numbers.length; i++){
            if (numbers[i] > max){
                max = numbers[i];
            }
        }

        return max;
    }

}