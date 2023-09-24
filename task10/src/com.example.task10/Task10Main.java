package com.example.task10;

public class Task10Main {
    public static void main(String[] args) {
        int[] arr = {5, 4, -7, 2};
        System.out.println(numMin(arr));
    }

    static int numMin(int[] arr) {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        int mininx = 0;
        int minum = arr[0];

        for (int i = 1; i < arr.length; i++){
            if (arr[i] <= minum){
                mininx = i;
                minum = arr[i];
            }
        }
        return mininx;
    }

}