package com.example.task13;
public class Task13Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        int[] arr = {9, 1100, 7, 8};
        System.out.println(java.util.Arrays.toString(removeMoreThen1000(arr)));
    }

    static int[] removeMoreThen1000(int[] arr) {

        int count = 0;

        for(int i = 0; i <arr.length; i++) {

            if (arr[i] < 1000) {
                count++;
            }
        }
        int[] newArr = new int[count];
        int j = 0;

        for(int i = 0; i < arr.length; i++) {

            if (arr[i] < 1000) {
                newArr[j] = arr[i];
                j++;
            }
        }
        return  newArr;
    }

}