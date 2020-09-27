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
    static int numMin(int[] arr) {
        int index = 0;
        int min = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(min>=arr[i]){
                min = arr[i];
                index = i;
            }
        }
        return index;
    }

    static void swap(int[] arr) {
        if(arr!=null && arr.length!=0) {
            int index = numMin(arr);
            int tmp = arr[0];
            arr[0] = arr[index];
            arr[index] = tmp;
        }
    }

}