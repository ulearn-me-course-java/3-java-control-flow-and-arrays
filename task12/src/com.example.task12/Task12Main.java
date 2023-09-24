package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {
        int[] arr = {9, 11, 7, 8};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        try {
            int minum;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i] < arr[j]) {
                        minum = arr[j];
                        arr[j] = arr[i];
                        arr[i] = minum;
                    }
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("если пришедший массив пуст, то ничего делать не нужно");
        } catch (NullPointerException e) {
            System.out.println("если пришедший массив null, то ничего делать не нужно");
        }
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
    }

}