package com.example.task10;

public class Task10Main {
    public static void main(String[] args) {

    }

    static int numMin(int[] arr) {
        int indx = 0;
        int tmpmin = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < tmpmin){
                tmpmin = arr[i];
                indx = i;
            }
            if(arr[i] == tmpmin)
                indx = i;
        }

        return indx;
    }
}