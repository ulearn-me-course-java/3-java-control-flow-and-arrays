package com.example.task11;

public class Task11Main {
    public static void main(String[] args) {
        int[] arr = null;
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }

    static void swap(int[] arr) {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей

        try {
            int minum = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (minum > arr[i]) {
                    minum = arr[0];
                    arr[0] = arr[i];
                    arr[i] = minum;
                    minum = arr[0];
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("если пришедший массив пуст, то ничего делать не нужно");
        }
        catch (NullPointerException e){
            System.out.println("если пришедший массив null, то ничего делать не нужно");
        }


    }

}