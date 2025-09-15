package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {


        int[] arr = {9, 11, 7, 8};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }

    static void selectionSort(int[] arr) {

        if (arr == null || arr.length == 0) {
            return;
        }
        else {
            for (int i = 0; i < arr.length-1; i++) {
                int min = arr[i];
                int cnt = 0;
                for (int j =i+1; j < arr.length; j++) {
                    if (arr[j] < min) {
                        min = arr[j];
                        cnt = j;
                    }

                }
                if (cnt != 0) {
                    int temp = arr[i];
                    arr[i] = arr[cnt];
                    arr[cnt] = temp;
                }
            }

            //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        }
    }
}

