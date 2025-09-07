package com.example.task05;

public class Task05Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        System.out.println(getMin(10,234,123412341));


    }

    static int getMin(int a, int b, int c) {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        int min = Integer.MAX_VALUE;
        int[] arr = new int[]{a,b,c};
        for(int i = 0;i <arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }

        return min;
    }
}