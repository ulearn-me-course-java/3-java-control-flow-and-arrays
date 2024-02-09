package com.example.task07;

public class Task07Main {
    public static void main(String[] args) {

        int[] myArray = new int[4];
        myArray[0] = 25;
        myArray[1] = 10;
        myArray[2] = 10;
        myArray[3] = 5;
        System.out.println(sum(myArray));
    }

    static int sum(int[] arr) {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        int summa = 0;
        for (int num : arr){
            summa += num;
        }
        return summa;
    }

}