package com.example.task06;

public class Task06Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getMax(1, 2, 3, 4));
         */
    }

    static int getMax(int a, int b, int c, int d) {
        int[] input = {a, b, c, d};
        int maxNumber = a;

        for(int i = 0; i < input.length - 1; i++){
            if(input[i] < input[i + 1]){
                maxNumber = input[i + 1];
            }
        }

        return maxNumber;
    }

}