package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        int[] arr = {11, 3, 7, 8, 9, 12, 4};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        if (arr == null) return;
        if(arr.length == 0) return;

        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            for (int j = i; j < arr.length; j++) {
                min = Math.min(min, arr[j]);
            }

            int index = 0;

            for (int k = 0; k < arr.length; k++) {
                if (arr[k] == min)
                    index = k;
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        
    }

}