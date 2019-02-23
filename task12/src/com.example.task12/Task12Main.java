package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {

    }

    static void selectionSort(int[] arr) {
        if(arr == null || arr.length == 0) return;

        int tmpmin = arr[0];
        int indx = 0;

        for(int i = 0; i < arr.length - 1; i++){  //qsort the best
            for(int j = i; j < arr.length; j++){
                if(arr[j] < tmpmin) {
                    tmpmin = arr[j];
                    indx = j;
                }

                if(arr[j] == tmpmin)
                    indx = j;
            }

            arr[indx] = arr[i];
            arr[i] = tmpmin;
            tmpmin = arr[i + 1];
            indx = 1;
        }
    }
}