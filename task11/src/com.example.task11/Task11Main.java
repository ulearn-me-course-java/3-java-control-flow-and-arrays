package com.example.task11;

public class Task11Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = {7, 5, 9};
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));
         */
    }

    static void swap(int[] arr) {
        int max = Integer.MAX_VALUE;
        int counter = -1;
        if(arr == null) return;
        for (int i = 0; i < arr.length; i++)
        {
            if(max >= arr[i]) {
                max = arr[i];
                counter = i;
            }
        }
        if(counter == -1) return;
        int temp = arr[counter];
        arr[counter] = arr[0];
        arr[0] = temp;
    }

}